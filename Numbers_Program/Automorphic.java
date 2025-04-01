package Numbers_Program;

import java.util.Scanner;

public class Automorphic
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Prime number");
        System.out.println("2. Automorphic number");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        System.out.print("Enter number: ");
        int num = in.nextInt();

        switch (choice) {
            case 1:
            int c = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c++;
                }
            }
            if (c == 2) 
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is not Prime");
            break;

            case 2:
            int numCopy = num;
            int sq = num * num;
            int d = 0;

  
            while(num > 0) {
                d++;
                num /= 10;
            }//digits counted here

        
            int ld = (int)(sq % Math.pow(10, d)); 

            if (ld == numCopy)
                System.out.println(numCopy + " is automorphic");
            else
                System.out.println(numCopy + " is not automorphic");
            break;

            default:
            System.out.println("Incorrect Choice");
            break;
        }
    }
}