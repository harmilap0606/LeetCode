class Solution {

    public void solve(int index , int[] nums , int n , List<Integer> ds, List<List<Integer>> ans){
        if(index==n){
            ans.add(new ArrayList<>(ds));
            return; // always return 
        }

        ds.add(nums[index]);
        solve(index+1,nums,n,ds,ans);

        ds.remove(ds.size()-1);
        solve(index+1,nums,n,ds,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0,nums,nums.length,ds,ans);
        return ans;
        
    }
}