package Dynamic_Prog;

public class Climbing_Stairs {

    //memoization in dynamic programming

    public static int memoizclimbingstairs(int num,int[] qb){

        if(num == 0){
            return 1;
        }else if (num < 0) {
            return 0;
            
        }

        if(qb[num] > 0){
            return qb[num];
        }
        int path1 = memoizclimbingstairs(num - 1, qb);
        int path2 = memoizclimbingstairs(num - 2, qb);
        int path3 = memoizclimbingstairs(num - 3, qb);

        int totalPath = path1 + path2 + path3;
  
        qb[num] = totalPath;
        return totalPath;

    }
    

   
    public static void main(String[] args) {
        int num = 10;
        int answer = memoizclimbingstairs(num,new int[num + 1]);
        // int answer2 = tabulationclimbingstairs(num,new int[num + 1]);
        System.out.println(answer);
    }
    
}
