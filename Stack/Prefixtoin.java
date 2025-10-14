
import java.util.Stack;
public class Prefixtoin {
    


    // Function to check if character is operator
    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    // Function to convert Prefix to Infix
    static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If character is an operator
            if (isOperator(c)) {
                // Pop two operands from stack
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Form the infix expression
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
            // If character is operand
            else {
                stack.push(c + "");
            }
        }

        // The final element in stack will be our result
        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Infix Expression: " + prefixToInfix(prefix));
    }


}
