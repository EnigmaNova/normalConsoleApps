import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TextAnalyzer {

    public TextStatistics analyzeText(String text){
        TextStatistics stats = new TextStatistics();
        stats.setWordCount(countWords(text));
        stats.setCharacterCount(countCharacter(text));
        stats.setLineCount(countLines(text));
        stats.setMostFrequentWords(getMostFrequentWords(text, 2));
        return stats;
    }
    public int countWords(String text){
        if(text.isEmpty()){
            return 0;
        } 
        if (text.isEmpty()) return 0;
        return text.split("\\s+").length;
    }

    public int countCharacter(String line){
        return line.length();
    }

    public int countLines(String line){
        String[] arr = line.split("\r\n|\r|\n");
        return arr.length;
    }

    public Map<String, Integer> getMostFrequentWords(String text, int topN){
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        return wordFrequency.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(topN)
                .collect(LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll);
    }
}
