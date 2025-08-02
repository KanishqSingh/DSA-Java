import java.util.Scanner;

public class MaxDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDonation = 0;

        for(int i = 0; i < N; i++) {
            int min = arr[i];
            for(int j = i; j < N; j++) {
                min = Math.min(min, arr[j]);
                int length = j - i + 1;
                int total = min * length;
                maxDonation = Math.max(maxDonation, total);
            }
        }

        System.out.println(maxDonation);
    }
}
