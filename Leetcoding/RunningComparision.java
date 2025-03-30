package Leetcoding;
import java.util.*;


public class RunningComparision {
    public static List<Integer> countHappyDays(List<int[]> testCases) {
        List<Integer> results = new ArrayList<>();
        
        for (int[] caseData : testCases) {
            int N = caseData[0];
            int[] A = Arrays.copyOfRange(caseData, 1, N + 1);
            int[] B = Arrays.copyOfRange(caseData, N + 1, 2 * N + 1);
            int happyDays = 0;
            
            for (int i = 0; i < N; i++) {
                if (!(B[i] > 2 * A[i] || A[i] > 2 * B[i])) {
                    happyDays++;
                }
            }
            
            results.add(happyDays);
        }
        
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<int[]> testCases = new ArrayList<>();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] caseData = new int[2 * N + 1];
            caseData[0] = N;
            
            for (int i = 1; i <= N; i++) {
                caseData[i] = scanner.nextInt();
            }
            for (int i = N + 1; i <= 2 * N; i++) {
                caseData[i] = scanner.nextInt();
            }
            
            testCases.add(caseData);
        }
        
        List<Integer> results = countHappyDays(testCases);
        for (int res : results) {
            System.out.println(res);
        }
        
        scanner.close();
    }
}
