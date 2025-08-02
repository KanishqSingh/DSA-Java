
import java.util.*;

public class RomanValidator {

    static Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public static boolean isValidRoman(String s) {
        if (s == null || s.isEmpty())
            return false;

        // Check for invalid characters
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch))
                return false;
        }

        // Check value order and valid subtraction
        int prevValue = map.get(s.charAt(0));
        int repeatCount = 1;

        for (int i = 1; i < s.length(); i++) {
            int currValue = map.get(s.charAt(i));

            // Check invalid repetitions
            if (map.get(s.charAt(i)) == map.get(s.charAt(i - 1))) {
                repeatCount++;
                // Only I, X, C, and M can repeat up to 3 times
                if ("VLD".indexOf(s.charAt(i)) >= 0 || repeatCount > 3)
                    return false;
            } else {
                repeatCount = 1;
            }

            // Check invalid subtraction like I before L or D
            if (prevValue < currValue) {
                // Valid subtractive combinations
                if (!((prevValue == 1 && (currValue == 5 || currValue == 10)) ||
                        (prevValue == 10 && (currValue == 50 || currValue == 100)) ||
                        (prevValue == 100 && (currValue == 500 || currValue == 1000)))) {
                    return false;
                }

                // Subtraction should not happen twice in a row
                if (i >= 2 && map.get(s.charAt(i - 2)) < map.get(s.charAt(i - 1))) {
                    return false;
                }
            }

            prevValue = currValue;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "MCMXCIV"; // valid
        System.out.println(isValidRoman(input)); // true

        String input2 = "IC"; // invalid
        System.out.println(isValidRoman(input2)); // false
    }
}