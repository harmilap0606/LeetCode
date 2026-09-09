class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long start = 1000;
        long end = 1000;
        long mul = 1;
        long total=0;

        while(start<=n){
            end = start*1000-1;
            if(end>n) end=n;
            total += (end-start+1)*mul;
            mul++;

            start=start*1000;

        }

        return total;


        
    }
}