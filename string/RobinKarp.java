// package string;

// public class RobinKarp {

//     public static int Robinkarp(String text, String pat) {
//         int d = 256; 
//         int q = 101; 

//         int n = text.length();
//         int m = pat.length();
//         int hash_pat = 0; 
//         int hash_text = 0; 
//         int h = 1;

        
//         for (int i = 0; i < m - 1; i++) {
//             h = (h * d) % q;
//         }

        
//         for (int i = 0; i < m; i++) {
//             hash_pat = (d * hash_pat + pat.charAt(i)) % q;
//             hash_text = (d * hash_text + text.charAt(i)) % q;
//         }

       
//         for (int i = 0; i <= n - m; i++) {
            
//             if (hash_pat == hash_text) {
                
//                 int j;
//                 for (j = 0; j < m; j++) {
//                     if (text.charAt(i + j) != pat.charAt(j)) {
//                         break;
//                     }
//                 }
//                 if (j == m) { 
//                     return i;
//                 }
//             }

       
//             if (i < n - m) {
//                 hash_text = (d * (hash_text - text.charAt(i) * h) + text.charAt(i + m)) % q;

               
//                 if (hash_text < 0) {
//                     hash_text += q;
//                 }
//             }
//         }

//         return -1; 
//     }

//     public static void main(String[] args) {
//         String text = "abbabbabbaaa";
//         String pat = "bab";

//         int result = Robinkarp(text, pat);

//         if (result != -1) {
//             System.out.println("Pattern found at index: " + result);
//         } else {
//             System.out.println("Pattern not found");
//         }
//     }
// }
