class Solution {
    public boolean canJump(int[] nums) {
        int maxDest = 0;
        int n = nums.length;

        for(int i = 0 ;  i < n ; i++ ){

            if (i>maxDest) return false;

            int steps = i + nums[i];
            
            maxDest = Math.max(steps,maxDest);

            if(maxDest >= n-1 ) return true;

        }

        return true;
    }
}