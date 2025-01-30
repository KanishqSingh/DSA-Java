package string;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = SC.nextLine();
        SC.close();  

        String[] word = str.split(" ");

        for(int i = word.length - 1; i >= 0; i--) {  
            System.out.print(word[i]);  
            if (i > 0) {  
                System.out.print(" ");  
            }
        }
    }
}
