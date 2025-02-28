
import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of participants: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Number of participants must be greater than zero.");
            return;
        }
        
        double[] times = new double[n];
        double minTime = Double.MAX_VALUE;
        int winnerIndex = -1;
        double totalTime = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter finish time for participant " + (i + 1) + ": ");
            times[i] = scanner.nextDouble();
            totalTime += times[i];
            
            if (times[i] < minTime) {
                minTime = times[i];
                winnerIndex = i + 1;
            }
        }
        
        double averageTime = totalTime / n;
        
        System.out.println("Participant " + winnerIndex + " finished first with a time of " + minTime + " seconds.");
        System.out.println("The average finish time is " + averageTime + " seconds.");
        
        scanner.close();
    }
}