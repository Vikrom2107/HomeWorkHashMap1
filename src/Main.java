import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
            "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex " +
            "ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
            "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
            "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> charNumber = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (!charNumber.containsKey(ch)) {
                    charNumber.put(ch, 1);
                } else {
                    int number = charNumber.get(ch) + 1;
                    charNumber.put(ch, number);
                }
            }
        }
        MaxAndMinValue(charNumber);

    }

    private static void MaxAndMinValue(Map<Character, Integer> charNumber) {
        char chMax = ' ';
        char chMin = ' ';
        int maxNumber = 0;
        int minNumber = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> kv : charNumber.entrySet()) {
//            System.out.println(kv.getKey() + " " + kv.getValue());
            if (kv.getValue() > maxNumber) {
                chMax = kv.getKey();
                maxNumber = kv.getValue();
            }
            if (kv.getValue() < minNumber) {
                chMin = kv.getKey();
                minNumber = kv.getValue();
            }
        }
        System.out.println("Максимальное значение " + chMax + " " + charNumber.get(chMax));
        System.out.println("Минимальное значение " + chMin + " " + charNumber.get(chMin));
    }
}