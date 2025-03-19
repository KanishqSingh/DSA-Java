public class Sum {
    public static double add(double a, double b) {
        return Math.log(Math.exp(a) * Math.exp(b));
    }




    public static int add(int a, int b) {
        while (b > 0) { 
            a++;
            b--;
        }
        while (b < 0) { 
            a--;
            b++;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println("Sum: " + add(num1, num2));

        int num3 = 10;
        int num4 = -3;
        System.out.println("Sum: " + add(num3, num4));
        double num1a = 5;
        double num2b = 7;
        System.out.println("Sum: " + add(num1a, num2b));
    }
}
