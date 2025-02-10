
import java.util.Scanner;
public class ChefAndCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) { 
            int N = sc.nextInt(); 
            int missingDoll = 0;

            for (int i = 0; i < N; i++) { 
                int dollType = sc.nextInt();
                missingDoll ^= dollType; 
            }

            System.out.println(missingDoll); 
        }

        sc.close();
    }


    
    
}



    