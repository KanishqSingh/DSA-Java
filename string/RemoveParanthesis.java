package string;

public class RemoveParanthesis {
    public static void main(String[] args) {
        String str = "(Hello my name is kanishq)";
        if(str.length()>2 && str.charAt(0) == '(' && str.charAt(str.length()-1) ==')'){
            String result = str.substring(1,str.length()-1 );
            System.out.println("Modified String :- " +result);
        }else{
            System.out.println("No paranthesis");
        }

    }
}
