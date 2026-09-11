class Solution {

    public void solve(int ind , int t, int n , int [] arr , List<Integer> ds, List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind ; i < n ; i++){
            if(arr[i]<=t){
                ds.add(arr[i]);
                solve(i,t-arr[i],n,arr,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,target,candidates.length,candidates,ds,ans);
        return ans;
    }
}