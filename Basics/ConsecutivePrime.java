import java.util.*;

public class ConsecutivePrime {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 2; i <= N; i++) {

            if (isPrime(i)) {
                sum += i;

                if (sum > N) break;

                if (isPrime(sum)) {
                    System.out.println(sum); // print the number
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);
    }
}
