package recursion;

public class Josephus {


    
    static int jos(int n , int k){
        int result = 0;
        for (int i=2;i<=n; i++){
            result = (result+k)%i;
        } 
        return result;
    }
    
  //recursion
    static int jos1(int n , int k){

        if(n==1){
            return 0;
        }
        
  
        return (jos1(n - 1, k) + k) % n;
    }
	public static void main(String[] args) {
		System.out.println(jos(2,3)+1);
        System.out.println(jos1(2,3)+1);
	}

}
