public class LemonadeChange {
    public static boolean solution(int[] val) {
        int five = 0, ten = 0, twenty = 0;
        
        for (int i = 0; i < val.length; i++) {
            if (val[i] == 5) {
                five += 1;
            } else if (val[i] == 10) {
                if (five > 0) {
                    ten += 1;
                    five -= 1;

                }else{
                    return false;
                }

            } else {
                twenty += 1;
                if (ten > 0 && five > 0) {
                    ten -= 1;
                    five -= 1;
                } else if (five > 3) {
                    five -= 3;
                }else{
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] val = { 5, 5,10, 10, 20 };
        boolean res = solution(val);
        System.out.println(res);
    }
}
