class Solution {
    public int jump(int[] nums) {

        int maxDest = 0;
        int count = 0;
        int n = nums.length;
        if(n==1) return 0;
        for(int i = 0 ;  i < n ; i++ ){

            int steps = i + nums[i];
            count++;
            
            maxDest = Math.max(steps,maxDest);

            if(maxDest >= n-1 ) return count;

        }

        return 0;
        
    }
}