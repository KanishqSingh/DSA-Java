

import java.util.Map;

public class RomanToInteger {
    public static int convertingTOInteger(String str) {
        int ans = 0;

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000

        );

        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                ans = ans - map.get(str.charAt(i));
            } else {
                ans += map.get(str.charAt(i));
            }

        }
        return ans+map.get(str.charAt(str.length()-1));

    }

    public static void main(String[] args) {
        // String str = "III";
        String str1 = "VII";
        // System.out.println(convertingTOInteger(str));
        System.out.println(convertingTOInteger(str1));
    }

}