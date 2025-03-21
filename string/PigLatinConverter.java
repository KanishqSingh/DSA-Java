
public class PigLatinConverter {
    public static String toPigLatin(String word) {
        word = word.toLowerCase(); 

        if (word.length() == 0) return word; 

       
        if (isVowel(word.charAt(0))) {
            return word + "way";
        } else {
           
            int firstVowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) {
                    firstVowelIndex = i;
                    break;
                }
            }

            
            if (firstVowelIndex == -1) {
                return word + "ay";
            }

            
            String pigLatinWord = word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
            return pigLatinWord;
        }
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "apple", "string", "octopus", "glove"};
        
        System.out.println("Pig Latin Conversion:");
        for (String word : words) {
            System.out.println(word + " → " + toPigLatin(word));
        }
    }
}

