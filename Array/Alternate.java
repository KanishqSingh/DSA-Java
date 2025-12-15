import java.util.ArrayList;

class Alternate{

public static int[] Alternate(int[] A, int n){
    
  ArrayList<Integer> pos=new ArrayList<>();
  ArrayList<Integer> neg=new ArrayList<>();
  
  
  for(int i=0;i<n;i++){
      
      if(A[i]>0) pos.add(A[i]);
      else neg.add(A[i]);
  }
  
  
  for(int i=0;i<n/2;i++){
      
      A[2*i] = pos.get(i)
      A[2*i+1] = neg.get(i)
  }

 
  return A;
}    

public static void main(String args[]) 
{
 
  int n = 4;
  int A[]= {3,-2 ,1 ,0, 4 ,-1, 4};


  int[]ans= Alternate(A,n);
  
  for (int i = 0; i < n; i++) {
    System.out.print(ans[i]+" ");
  }

}
}
