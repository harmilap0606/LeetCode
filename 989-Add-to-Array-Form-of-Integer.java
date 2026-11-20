class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int N = 0;

        List<Integer> ans = new ArrayList<>();

        int multi = 1;

        for(int i = num.length-1 ; i >=0 ; i-- ){
            N = num[i]*multi + N;
            multi*=10;
        }
        int sum = N+k;

        while(sum>0){

            int d = sum%10;
            sum/=10;
            ans.add(d);
        }

        Collections.reverse(ans);



       

        return ans;



        
    }
}