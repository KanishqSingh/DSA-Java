public class StringPatBasic {
    public static void main(String[] args) {
        String str = "Computer";
        for(int i = 1;i<=str.length();i+=2){
            int spaces = str.length() - i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            
                System.out.println(str.substring(0, i));
            
            
        }
    }
}
