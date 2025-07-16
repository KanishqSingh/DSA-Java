package Dynamic_Prog;

import java.util.Scanner;

public class ColorFence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of fences");
        int fences = sc.nextInt();
        System.out.println("enter number of colors");
        int colors = sc.nextInt();

        int same = colors * 1;
        int diff = colors * (colors-1);

        int total = same + diff;

        for (int i = 3; i <= fences; i++) {

            same = diff * 1;
            diff = total * (colors - 1);

            total = same + diff;
            
        }

        System.out.println(total);

    }
    
}
