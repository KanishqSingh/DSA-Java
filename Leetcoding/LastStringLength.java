package Leetcoding;

public class LastStringLength {

    
        public static int lengthOfLastWord(String s) {
            
            s = s.trim();
            
            
            int lastSpaceIndex = s.lastIndexOf(' ');
    
            
            return s.length() - lastSpaceIndex - 1;
        }
    
        public static void main(String[] args) {
            
            System.out.println(lengthOfLastWord("Hello World"));         
            System.out.println(lengthOfLastWord("I am Batman")); 
            System.out.println(lengthOfLastWord("luffy is still joyboy"));
        }
    }
    
    

