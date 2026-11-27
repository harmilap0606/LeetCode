class Solution {
    public boolean canAliceWin(int n) {
        int is = 0;
        int s = 10;
        while(n>0){
            n-=s;
            s--;
            if(n==0)  break;
            is++;
        }

        if(is%2==0) return true;
        return false;
    }
}