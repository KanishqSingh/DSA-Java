

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            result = getNext(result);
        }

        return result;
    }

    private String getNext(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char ch = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            } else {
                sb.append(count);
                sb.append(ch);
                ch = s.charAt(i);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(ch);

        return sb.toString();
    }

    
    public static void main(String[] args) {
        CountAndSay sol = new CountAndSay();
        int n = 4;
        System.out.println("countAndSay(" + n + ") = " + sol.countAndSay(n));
    }
}
