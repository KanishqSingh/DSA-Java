
package recursion;
import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
    public static void main(String[] args) {
        int n = 3; // Change n for different results
        List<String> result = Paranthesis(n);
        System.out.println(result);
    }

    public static List<String> Paranthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    private static void generate(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        if (open > 0) {
            generate(result, current + "(", open - 1, close);
        }
        
        if (close > open) {
            generate(result, current + ")", open, close - 1);
        }
    }
}
