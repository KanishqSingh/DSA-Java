package recursion;

public class GoodNums {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        long n = 50; 
        System.out.println(countGoodNumbers(n));
    }

    public static int countGoodNumbers(long n) {
        long evenPlaces = (n + 1) / 2; 
        long oddPlaces = n / 2;

        long evenChoices = power(5, evenPlaces, MOD); 
        long oddChoices = power(4, oddPlaces, MOD);  

        return (int) ((evenChoices * oddChoices) % MOD);
    }

    
    private static long power(long x, long y, int mod) {
        if (y == 0) return 1; 

        long halfPower = power(x, y / 2, mod);
        long result = (halfPower * halfPower) % mod;

        
        if (y % 2 == 1) result = (result * x) % mod;

        return result;
    }



    
}


    

    