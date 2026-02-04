  import java.util.HashMap;
public class CountAngaram {
  


    public static int countAnagrams(String txt, String pat) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of pattern
        for (char c : pat.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        int k = pat.length();
        int count = map.size();  // number of unique chars to match
        int ans = 0;

        while (j < txt.length()) {
            // Step 2: Add current char to window
            char ch = txt.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) count--;
            }

            // Step 3: Window size not reached
            if (j - i + 1 < k) {
                j++;
            }
            // Step 4: Window size hit
            else if (j - i + 1 == k) {
                // If all chars matched
                if (count == 0) ans++;

                // Step 5: Remove i-th char
                char leftChar = txt.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) == 1) count++;
                }
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println(countAnagrams(txt, pat)); // Output: 3
    }


}
