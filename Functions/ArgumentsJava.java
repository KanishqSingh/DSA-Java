package Functions;

public class ArgumentsJava {

    public static int sum(Integer... args){
        int sum =0;
        for(Integer i : args){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println(sum(1,2,3,4));
    }
    
}
