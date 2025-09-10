package Leetcoding;
import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int start = 0, maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            
            set.add(s.charAt(end));

            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); 
        System.out.println(lengthOfLongestSubstring("bbbbb"));   

        System.out.println(lengthOfLongestSubstring("pwwkew")); 
         
        System.out.println(lengthOfLongestSubstring(""));         
    }
}
