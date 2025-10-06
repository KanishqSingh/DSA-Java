import java.util.Arrays;

public class AssignCookies {
    public static int value(int[] greed, int[] size) {

        Arrays.sort(greed);
        Arrays.sort(size);

        int l = 0; 
        int r = 0; 

        while (l < greed.length && r < size.length) {
            if (greed[l] <= size[r]) {
                l++; 
            }
            r++; 
        }

        return l;
    }

    public static void main(String[] args) {
        int[] greed = { 4, 1, 5, 3, 2, 6 };
        int[] size = { 1, 5, 4, 1, 1, 2, 7, 3 };

        int result = value(greed, size);
        System.out.println("Children satisfied: " + result);
    }
}
