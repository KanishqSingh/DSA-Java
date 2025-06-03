


public class CharacterSet {
    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        int k = 2;
        System.out.println("All possible strings of length " + k + ":");
        generateStrings(set, "", k);
    }

    public static void generateStrings(char[] set, String prefix, int k) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (char c : set) {
            generateStrings(set, prefix + c, k - 1);
        }
    }
}
