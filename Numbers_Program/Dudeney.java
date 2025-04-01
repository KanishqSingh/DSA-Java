package Numbers_Program;

import java.util.Scanner;

public class Dudeney
{
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = SC.nextInt();

        int cubeRoot = (int)Math.round(Math.cbrt(n));
        if (cubeRoot * cubeRoot * cubeRoot == n) {

            int s = 0;
            int t = n;
            while (t != 0) {
                int d = t % 10;
                s += d;
                t /= 10;
            }
            
            if (s == cubeRoot) {
                System.out.println(n + " is a Dudeney number");
            }
            else {
                System.out.println(n + " is not a Dudeney number");
            }
        }
        else {
            System.out.println(n + " is not a Dudeney number");
        }
        SC.close();
    }
}