package Leetcoding;
import java.util.*;
public class ContainerWithMostWater {

    public static int calculatemax(int[] height){

        int maxwat = 0;
        int lp = 0;
        int rp = height.length - 1;
        while(lp < rp){
            int weight = rp - lp;
            int ht = Math.min(height[lp],height[rp]);
            int total = weight * ht;
            maxwat = Math.max(total,maxwat);
            
            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            } 

        }
        
        return maxwat;


    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculatemax(height));
    }
}
    

