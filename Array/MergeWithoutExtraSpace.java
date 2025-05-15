import java.util.Arrays;

public class MergeWithoutExtraSpace {
    
    
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < (n + m)) {
                // i-th element
                int a = (i < n) ? arr1[i] : arr2[i - n];
                // j-th element
                int b = (j < n) ? arr1[j] : arr2[j - n];

                if (a > b) {
                    // swap if needed
                    if (i < n && j < n) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < n && j >= n) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    } else {
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
