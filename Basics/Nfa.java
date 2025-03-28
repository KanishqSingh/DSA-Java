public class Nfa {

    
    public static boolean validateString(String input) {
        // Condition 1: The string must be exactly 4 characters long
        if (input.length() != 4) {
            return false;
        }

    
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'a' && input.charAt(i) != 'b') {
                return false;
            }
        }

       
        if (input.charAt(2) != 'a') {
            return false;
        }

       
        return true;
    }

    public static void main(String[] args) {
        
        String test1 = "abaa";
        String test2 = "abab";
        String test3 = "baba";
        String test4 = "aaab";
        String test5 = "aaaa";

        System.out.println("Test 1 (" + test1 + "): " + (validateString(test1) ? "Valid" : "Invalid"));
        System.out.println("Test 2 (" + test2 + "): " + (validateString(test2) ? "Valid" : "Invalid"));
        System.out.println("Test 3 (" + test3 + "): " + (validateString(test3) ? "Valid" : "Invalid"));
        System.out.println("Test 4 (" + test4 + "): " + (validateString(test4) ? "Valid" : "Invalid"));
        System.out.println("Test 5 (" + test5 + "): " + (validateString(test5) ? "Valid" : "Invalid"));
    }
}