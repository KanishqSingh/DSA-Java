package Unthinkable;

public class MaxProdWordLen {
    public int maxProduct(String[] words) {
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];

            for (int j = i + 1; j < words.length; j++) {
                String word2 = words[j];

                boolean hasCommon = false;

                for (int x = 0; x < word1.length(); x++) {
                    for (int y = 0; y < word2.length(); y++) {
                        if (word1.charAt(x) == word2.charAt(y)) {
                            hasCommon = true;
                            break;
                        }
                    }
                    if (hasCommon) break;
                }

                if (!hasCommon) {
                    int product = word1.length() * word2.length();
                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }


}
