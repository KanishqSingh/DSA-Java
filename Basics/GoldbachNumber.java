public class GoldbachNumber {
    
  
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    
    public static void findGoldbachPair(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Goldbach's conjecture applies only to even numbers greater than 2.");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return; 
            }
        }
        System.out.println("No Goldbach pair found.");
    }

    public static void main(String[] args) {
        int number = 28;  
        findGoldbachPair(number);
    }
}
