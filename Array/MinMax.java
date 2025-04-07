import java.util.Collections;
import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer>  arr1= new ArrayList<>();

        arr1.add(0);
        arr1.add(8);
        arr1.add(7);
        arr1.add(22);
        arr1.add(2);
        arr1.add(1);

        Collections.sort(arr1);

        int sum = 0;

        for(int i = 0;i<4;i++){
   
            sum += arr1.get(i);
        }

        int sum1 = 0;

        for(int i = arr1.size() - 4;i < arr1.size(); i++){


            sum1 += arr1.get(i); 
        }

        System.out.println(sum + " " + sum1);

    }
    
}
