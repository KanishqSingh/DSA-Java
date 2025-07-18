import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }

            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }

   
            else if (ch == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); 
                result += stack.pop(); 
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }

   
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        System.out.println(calc.calculate("1 + 1"));               
        System.out.println(calc.calculate(" 2-1 + 2 "));           
        System.out.println(calc.calculate("(1+(4+5+2)-3)+(6+8)")); 
    }
}
