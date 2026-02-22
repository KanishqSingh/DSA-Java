class Koko {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;
        
        for(int pile : piles){
            high = Math.max(high, pile);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            
            long totalHrs = 0;
            
            for(int pile : piles){
                totalHrs += (int)Math.ceil((double)pile / mid);
            }

            if(totalHrs <= h){
                high = mid - 1;  
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}