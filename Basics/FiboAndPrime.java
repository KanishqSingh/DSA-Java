import java.util.Scanner;
public class FiboAndPrime {
    
    // Function to check prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int fib1 = 0, fib2 = 1, fibNext;
        int prime = 2;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {  // odd index → fibonacci
                if (i == 1) {
                    System.out.print(fib1 + " ");
                } else if (i == 3) {
                    System.out.print(fib2 + " ");
                } else {
                    fibNext = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fibNext;
                    System.out.print(fibNext + " ");
                }

            } else {  // even index → prime
                while (!isPrime(prime)) {
                    prime++;
                }
                System.out.print(prime + " ");
                prime++;
            }
        }

        sc.close();
    }


}
