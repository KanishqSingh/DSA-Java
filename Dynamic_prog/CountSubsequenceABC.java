package Dynamic_Prog;

import java.util.Scanner;

public class CountSubsequenceABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < str.length(); i++) {

            char position = str.charAt(i);

            if (position == 'a') {
                
                a = 2 * a + 1;
                
            }else if (position == 'b') {

                ab = 2 * ab + a;
                
            }else if (position == 'c') {

                abc = 2 * abc + ab;
                
            }

            
        }

        System.out.println(abc);
    }
    
}
