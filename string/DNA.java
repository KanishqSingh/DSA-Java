

public class DNA {
    public static String shortestPalindrome(String s) {
        int n = s.length();
        String reverse = new StringBuilder(s).reverse().toString();
        
        
        for (int i = 0; i < n; i++) {
            if (s.startsWith(reverse.substring(i))) {
                return reverse.substring(0, i) + s;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "AACECAAA";
        System.out.println(shortestPalindrome(s)); 
    }
}
