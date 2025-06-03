
// import java.util.*;

// public class ConcatenateAllSubstring {
//     public List<Integer> findSubstring(String s, String[] words) {
//         List<Integer> result = new ArrayList<>();
//         if (s == null || words.length == 0) return result;

//         int wordLen = words[0].length();
//         int totalLen = wordLen * words.length;
//         Map<String, Integer> wordCount = new HashMap<>();

//         for (String word : words) wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

//         for (int i = 0; i < wordLen; i++) {
//             int left = i, right = i;
//             Map<String, Integer> seen = new HashMap<>();

//             while (right + wordLen <= s.length()) {
//                 String word = s.substring(right, right + wordLen);
//                 right += wordLen;

//                 if (wordCount.containsKey(word)) {
//                     seen.put(word, seen.getOrDefault(word, 0) + 1);

//                     while (seen.get(word) > wordCount.get(word)) {
//                         String leftWord = s.substring(left, left + wordLen);
//                         seen.put(leftWord, seen.get(leftWord) - 1);
//                         left += wordLen;
//                     }

//                     if (right - left == totalLen) result.add(left);
//                 } else {
//                     seen.clear();
//                     left = right;
//                 }
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         SubstringConcatenation solution = new SubstringConcatenation();
//         System.out.println(solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
//         System.out.println(solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
//         System.out.println(solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
//     }
// }
