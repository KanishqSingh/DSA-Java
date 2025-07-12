class JumpGame {
    public int jump(int[] nums) {
        int jumps = 0;         // Total jumps made
        int currentEnd = 0;    // End of the current jump range
        int farthest = 0;      // The farthest point that can be reached in the next jump

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // Time to jump to next range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
