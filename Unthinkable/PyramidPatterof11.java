public class PyramidPatterof11 {

    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            int temp = x; // copy

            while (temp > 0) {
                int rem = temp % 10;
                System.out.print(rem + " ");
                temp = temp / 10;
            }
            System.out.println();

            x = x * 11;
        }

    }

}
