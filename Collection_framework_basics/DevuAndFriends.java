package Collection_framework_basics;
import java.util.*;

public class DevuAndFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T ;i++){
            int n = sc.nextInt(); //number of frinds devu has
            Set<Integer> uniqueDays = new HashSet<>();

            for(int j=0;j<n;j++){
                uniqueDays.add(sc.nextInt());

            }
            System.out.println(uniqueDays.size());

        }
        sc.close();
    }
    
}




