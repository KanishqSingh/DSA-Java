import java.util.Stack;

public class ReversePolishNotation {

    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] token) {
        for (String st : token) {
            if (isOperator(st)) {
                int b = stack.pop();
                int a = stack.pop();

                int value = applyOperator(a, b, st);

                stack.push(value);

            } else {
                stack.push(Integer.parseInt(st));
            }

        }
        return stack.pop();

    }

    public boolean isOperator(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    public int applyOperator(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);

        }

    }

    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();
        String[] tokens1 = { "2", "1", "+", "3", "*" };
        System.out.println("Result: " + rpn.evalRPN(tokens1));

        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println("Result: " + rpn.evalRPN(tokens2)); 

        String[] tokens3 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println("Result: " + rpn.evalRPN(tokens3)); 
    }

}
