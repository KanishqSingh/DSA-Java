package Leetcoding;
public class ValidNumber {
    public boolean isNumber(String s) {
        s = s.trim(); // Remove leading/trailing whitespace
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                numSeen = true;
                if (eSeen) numAfterE = true;
            } else if (c == '+' || c == '-') {
                // Sign is only allowed at the beginning or after an e/E
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                // Dot is only allowed once and not after e/E
                if (dotSeen || eSeen) return false;
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                // e/E is only allowed once and must come after a number
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numAfterE = false;
            } else {
                // Invalid character
                return false;
            }
        }

        return numSeen && numAfterE;
    }

    public static void main(String[] args) {
        ValidNumber validator = new ValidNumber();
        System.out.println(validator.isNumber("2")); // true
        System.out.println(validator.isNumber("e")); // false
        System.out.println(validator.isNumber("2e10")); // true
        System.out.println(validator.isNumber("99e2.5")); // false
        System.out.println(validator.isNumber(".1")); // true
        System.out.println(validator.isNumber(".")); // false
        System.out.println(validator.isNumber("53.5e93")); // true
    }
}
