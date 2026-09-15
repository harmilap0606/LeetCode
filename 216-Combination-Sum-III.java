class Solution {

    void solve(int ind , int k ,int n , int sum, List<Integer> ds , List<List<Integer>> ans ){

        if(sum==n){
            if(ds.size() == k){
                ans.add(new ArrayList<>(ds));
            }
                return;
        }

        for(int i = ind ; i <= 9 ; i++){
            ds.add(i);
            sum+=i;
            solve(i+1,k,n,sum,ds,ans);
            sum-=i;
            ds.remove(ds.size()-1);
        }



    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(1,k,n,0,ds,ans);
        return ans;
    }
}