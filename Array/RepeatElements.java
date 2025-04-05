public class RepeatElements {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2};
        
        int d=4;
        int[] newarr = new int[arr1.length * d];

        for(int i=0;i<arr1.length;i++){
            newarr[i] = arr1[i];
        }

        for(int i=0;i<d;i++){
            for(int j=0;j<arr1.length;j++){
                newarr[i * arr1.length + j] = arr1[j];

            }
            
        }

        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i] + " ");
        }
    }
    
}
