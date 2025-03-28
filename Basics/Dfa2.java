public class Dfa2 {

    public static boolean Checkstring(String str){

        boolean startswithab = str.startsWith("ab");
        boolean endsWithba = str.endsWith("ba");

        return startswithab ^ endsWithba;
    }
    public static void main(String[] args) {
        String s1 = "abindia";
        String s2 = "indiaab";
        String s3 = "abindiaba";
        String s4 = "india";

        System.out.println(Checkstring(s1) ? "Accepted" : "Rejected");
        System.out.println(Checkstring(s2) ? "Accepted" : "Rejected");
        System.out.println(Checkstring(s3) ? "Accepted" : "Rejected");
        System.out.println(Checkstring(s4) ? "Accepted" : "Rejected");

    }
    
}
