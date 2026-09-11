class Solution {

    public void solve(int ind , int n,  int k , List<Integer> ds ,List<List<Integer>> ans){

        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(ind>n) return;

        ds.add(ind);
        solve(ind+1,n,k,ds,ans);
        ds.remove(ds.size()-1);
        solve(ind+1,n,k,ds,ans);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(1,n,k,ds,ans);
        return ans;
    }
}