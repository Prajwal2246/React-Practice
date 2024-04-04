import java.util.HashMap;

public class que3 {

    public static void countWords(String str) {
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Count: " + wordCountMap);
    }

    public static void main(String[] args) {
        String str = "Java is a programming language. Java is widely used for web development and software engineering.";
        countWords(str);
    }
}
