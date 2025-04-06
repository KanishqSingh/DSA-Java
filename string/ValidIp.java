public class ValidIp {

    static boolean isValidIp(String ip){

        if(ip == null || ip.isEmpty()){
            return false;
        }

        String[] parts = ip.split("\\.");

        if(parts.length != 4) {
            return false;
        }

        for(String part : parts){
            
            int number = Integer.parseInt(part);

            if(number < 0 || number > 255){
                return false;
            }
        }

        return true;


    }
    public static void main(String[] args) {
        String ip = "25555.0.0.0";

        if(isValidIp(ip)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
