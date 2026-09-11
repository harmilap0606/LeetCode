class Solution {
    void solve(int ind , int[] digits ,int num , int count ,boolean[] visited, Set<Integer> set){
        if(count==3){
            if(num%2==0){
                set.add(num);
            }
                return;
        }

        for(int i = 0 ; i < digits.length ; i++){
            if(visited[i]==true) continue;
            if(digits[i]==0 && count ==0) continue;
            visited[i]=true;
            solve(i,digits,digits[i]+num*10,count+1,visited,set);
            visited[i]=false;;
        }
    }
    public int totalNumbers(int[] digits) {
        boolean[] visited = new boolean[digits.length];
        Set<Integer> set = new HashSet<>();
        solve(0,digits,0,0,visited,set);
        return set.size();


        
    }
}