package Dynamic_Prog;

public class FibonacciDP {

    public static int fibonacci(int num,int[] qb){

        if(num == 0 || num ==1){
            return num;
        }

        if(qb[num] != 0){
            return qb[num];
        }

        int fibonum = fibonacci(num -1,qb) + fibonacci(num-2,qb);
        qb[num] = fibonum;

        return fibonum;

    }

    public static void main(String[] args) {
        int num = 6;
        int[] qb = new int[num +1];
        int fiboSum = fibonacci(num,qb);
        System.out.println(fiboSum);

    }
    
}
