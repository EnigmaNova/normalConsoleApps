public class App {
    private TextAnalyzer analyzer;
    private UserInput userInput;

    public App(){
        this.analyzer = new TextAnalyzer();
        this.userInput = new UserInput();
    }

    public void run(){
        System.out.println("Welcome to Text Analyzer!");
        String text = userInput.getString("Enter text to analyze:\n");
        TextStatistics stats = analyzer.analyzeText(text);
        System.out.println("\nAnalysis Results:");
        System.out.println(stats);
    }
    public static void main(String[] args) throws Exception {
        new App().run();
    }
}
