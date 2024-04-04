import java.util.HashMap;

public class que4 {
    public static void findDuplicateChars(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate Characters:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        String str = "Programming";
        findDuplicateChars(str);
    }
}
