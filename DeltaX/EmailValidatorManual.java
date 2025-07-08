public class EmailValidatorManual {

    public static boolean isValidEmail(String email) {
        if (email == null) return false;

        int length = 0;
  
        while (true) {
            try {
                email.charAt(length);
                length++;
            } catch (Exception e) {
                break;
            }
        }

 
        int atCount = 0;
        int atPosition = -1;
        boolean hasDotAfterAt = false;

        for (int i = 0; i < length; i++) {
            char c = email.charAt(i);

            if (!isAllowedCharacter(c)) return false;

            if (c == '@') {
                atCount++;
                atPosition = i;
            }

            if (atCount == 1 && i > atPosition && c == '.') {
                hasDotAfterAt = true;
            }
        }

        if (atCount != 1) return false;

        if (atPosition == 0) return false;

        if (atPosition == length - 1 || !hasDotAfterAt) return false;

 
        if (email.charAt(atPosition + 1) == '.') return false;
        if (email.charAt(length - 1) == '.') return false;

        return true;
    }

    private static boolean isAllowedCharacter(char c) {
     
        if (c >= '0' && c <= '9') return true;
      
        if (c >= 'A' && c <= 'Z') return true;
    
        if (c >= 'a' && c <= 'z') return true;
        
        if (c == '.' || c == '-' || c == '_' || c == '@') return true;

        return false;
    }

    public static void main(String[] args) {
        String[] testEmails = {
            "example@mail.com",
            "a@b.c",
            "@domain.com",
            "user@.com",
            "user@domain",
            "user@@domain.com",
            "user name@domain.com",
            "user@domain..com",
            "user@domain.com.",
            "user@domain.com"
        };

        for (int i = 0; i < testEmails.length; i++) {
            boolean result = isValidEmail(testEmails[i]);
            System.out.println(testEmails[i] + " is " + (result ? "valid" : "invalid"));
        }
    }
}