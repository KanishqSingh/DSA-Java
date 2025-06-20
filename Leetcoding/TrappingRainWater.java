package Leetcoding;

public class TrappingRainWater {

    public static int calculateheight(int[] height){

        int ans = 0 , lmax = 0 , rmax = 0 , l = 0 , r = height.length - 1;

        while(l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if(lmax < rmax){
                ans += lmax - height[l];
                l++;
            }else{
                ans += rmax - height[r];
                r--;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        
        int[] height = {0,1,0,2,4,0,1,3,6,0,0,1,4};
        System.out.println(calculateheight(height));
    }
    
}
