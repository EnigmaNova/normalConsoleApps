import java.util.Map;

public class TextStatistics {
    private int wordCount;
    private int characterCount;
    private int lineCount;
    private Map<String, Integer> mostFrequentWords;

    public int getWordCount(){return wordCount;}
    public void setWordCount(int wordCount){this.wordCount = wordCount;}

    public int getCharacterCount(){return characterCount;}
    public void setCharacterCount(int characterCount){this.characterCount = characterCount;}

    public int getLineCount(){return lineCount;}
    public void setLineCount(int lineCount){this.lineCount = lineCount;}

    public Map<String, Integer> getMostFrequentWords(){return mostFrequentWords;}
    public void setMostFrequentWords(Map<String, Integer> most){mostFrequentWords = most;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Word Count: ").append(wordCount).append("\n");
        sb.append("Character Count: ").append(characterCount).append("\n");
        sb.append("Line Count: ").append(lineCount).append("\n");
        sb.append("Most Frequent Words:\n");
        mostFrequentWords.forEach((word, count) ->
        sb.append(word).append(": ").append(count).append("\n"));
        return sb.toString();
    }
}
