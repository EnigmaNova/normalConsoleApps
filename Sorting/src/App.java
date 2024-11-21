public class App {
    private final UserInput userInput;

    public App(){
        this.userInput = new UserInput();
    }

    public void run(){
        System.out.println("Welcome to the Array Sorter!");

        String algoName = userInput.getAlgoChoice();
        String inputArray = userInput.getArrayInput();

        Manager manager = new Manager(algoName, inputArray);
        manager.sortArray();
    }

    public static void main(String[] args) throws Exception {
        new App().run();
    }
}
