    
import java.util.Scanner;

public class Railway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] oppositeSeat = {11, 12, 9, 10, 7, 8, 5, 6, 3, 4, 1, 2};
        String[] seatType = {"WS", "MS", "AS", "AS", "MS", "WS", "WS", "MS", "AS", "AS", "MS", "WS"};

        while (T-- > 0) {
            int N = scanner.nextInt();
            int mod = (N - 1) % 12;
            int facingSeat = N + (oppositeSeat[mod] - (mod + 1));
            System.out.println(facingSeat + " " + seatType[mod]);
        }
        scanner.close();
    }
}
