
import java.util.Scanner;

public class Dfa {
    public static boolean isAccepted(String binaryString) {
        int state = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                state = (state == 0) ? 0 : (state == 1) ? 2 : 1;
            } else if (c == '1') {
                state = (state == 0) ? 1 : (state == 1) ? 0 : 2;
            } else {
                return false;
            }
        }
        return state == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = sc.next();
        
        if (isAccepted(input)) {
            System.out.println("Accepted (Binary value is divisible by 3).");
        } else {
            System.out.println("Rejected.");
        }
        
        sc.close();
    }
}
