class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        long N = 0;

        List<Integer> ans = new ArrayList<>();

        long multi = 1;

        for(int i = num.length-1 ; i >=0 ; i-- ){
            N = num[i]*multi + N;
            multi*=10;
        }
        long sum = N+k;

        while(sum>0){

            long d = sum%10;
            sum/=10;
            ans.add((int)d);
        }

        Collections.reverse(ans);



       

        return ans;



        
    }
}