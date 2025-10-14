import java.util.Stack;
public class PreToPost {
    



    // Check if character is operator
    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    // Function to convert Prefix to Postfix
    static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // If character is an operator
            if (isOperator(c)) {
                // Pop two operands
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Form postfix expression: operand1 operand2 operator
                String temp = op1 + op2 + c;
                stack.push(temp);
            } 
            // If character is operand
            else {
                stack.push(c + "");
            }
        }

        // Final element in stack is the postfix expression
        return stack.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: " + prefixToPostfix(prefix));
    }
}


