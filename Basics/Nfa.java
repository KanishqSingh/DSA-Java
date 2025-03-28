public class Nfa {

    
    public static boolean validateString(String input) {
      
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

        System.out.println(validateString(test1)? "Accepted" : "Rejected");
        System.out.println(validateString(test2)? "Accepted" : "Rejected");
        System.out.println(validateString(test3)? "Accepted" : "Rejected");
        System.out.println(validateString(test4)? "Accepted" : "Rejected");
        System.out.println(validateString(test5)? "Accepted" : "Rejected");
    }
}