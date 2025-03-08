package Collection_framework_basics;


public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int index = 0, step = 1;
        for (char c : s.toCharArray()) {
            rows[index].append(c);
            if (index == 0) step = 1;
            else if (index == numRows - 1) step = -1;
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion solution = new ZigzagConversion();
        System.out.println(solution.convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
        System.out.println(solution.convert("PAYPALISHIRING", 4)); // PINALSIGYAHRPI
        System.out.println(solution.convert("A", 1)); // A
    }
}
