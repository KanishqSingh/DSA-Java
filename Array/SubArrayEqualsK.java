public class SubArrayEqualsK {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 4, 0, 1, 5, 7, 10 };
        int k = 17;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
                

            }

        }
        System.out.println("count= "+count);
    }
}
