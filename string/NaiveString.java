// package string;

// public class NaiveString {

//     public static int Naivestring(String text,String pat){

//         int n = text.length();
//         int m = pat.length();
//         for(int i =0;i<n-m;i++){
//             int j;
//             for(j=0;j<m;j++){
//                 if (text.charAt(i+j) != pat.charAt(j)) {
//                     break;
                    
//                 }


//             }
//             if(j == m){
//                 return j;
//             }

//         }
//         return -1;
//     }

    
//     public static void main(String[] args) {
//         String text = "abbabbabbaaa";
//         String pat = "bab";

//         int result = Naivestring(text,pat);

//         if(result != -1){
//             System.out.println("Index" + result);
//         } else{
//             System.out.println("Not found");
//         }


        
//     }
    
// }

