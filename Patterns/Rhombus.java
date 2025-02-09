public class Rhombus {
    public static void main(String[] args) {
        
        int i,j,space=0;

         

        for(i=1;i<=5;i++){
            space = 5-i;
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1;j<=5;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
