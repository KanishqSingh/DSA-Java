package Collection_framework_basics;
import java.util.ArrayList;

public class ArrayDouble {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        

        arr1.add(0);
        arr1.add(1);
        arr1.add(2);
        int size = arr1.size();

        for(int i=0;i<2;i++){
            for(int j=0;j<size;j++){
                arr1.add(arr1.get(j));
            }
        }
        System.out.println(arr1);
    }

    
}
