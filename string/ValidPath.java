
import java.util.*;

public class ValidPath {
    public static String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                stack.push(part);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, "/" + stack.pop());
        }
        
        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/")); // Output: "/home"
        System.out.println(simplifyPath("/home//foo/")); // Output: "/home/foo"
        System.out.println(simplifyPath("/home/user/Documents/../Pictures")); // Output: "/home/user/Pictures"
        System.out.println(simplifyPath("/../")); // Output: "/"
        System.out.println(simplifyPath("/.../a/../b/c/../d/./")); // Output: "/.../b/d"
    }
}
