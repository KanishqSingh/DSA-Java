

import java.util.*;

public class LongestValidTransmission {
    public static int longestValidTransmission(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int maxLength = 0;
        int lastInvalidIndex = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxLength = Math.max(maxLength, i - lastInvalidIndex);
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                } else {
                    lastInvalidIndex = i;
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        System.out.println(longestValidTransmission(s));
    }
}
