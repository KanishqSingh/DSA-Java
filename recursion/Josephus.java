package recursion;

public class Josephus {


    
    static int jos(int n , int k){
        int result = 0;
        for (int i=2;i<=n; i++){
            result = (result+k)%i;
        } 
        return result;
    }
	public static void main(String[] args) {
		System.out.println(jos(2,3)+1);
	}

}
