public class ArrayLeftShift
{
    
    static void shiftArray(int[] arr1,int size,int d){
        int[] arrExtra = new int[size];
        for(int i=0;i<size;i++){
            arrExtra[i] = 0;
        }
        
        for(int i=0;i<size;i++){
            if(i-d < 0){
                arrExtra[i+(size-d)] = arr1[i];
            } else{
                arrExtra[i-d] = arr1[i];
            }
        }
        for(int i=0;i<size;i++){
		    arr1[i] = arrExtra[i];
		}
    }
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int size = arr1.length;
		int d=3;
		
		shiftArray(arr1,size,d);
        
		for(int i=0;i<size;i++){
		    System.out.println(arr1[i]);
		}
	}
}
