class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        ArrayList<Integer> ls = new ArrayList<>();

        for(int i = 0 ; i < s.length() ; i++){
            int a = t.charAt(i)-'a';
            int b = s.charAt(i)-'a';

            int c = Math.abs(a-b);

            ls.add(c);

        }

        int l = 0;
        int max_len = 0;
        int cost = 0;

        for(int r = 0 ; r < ls.size() ; r++){
            cost+=ls.get(r);

            while(cost>maxCost){
                cost-=ls.get(l);
                l++;
            }

            max_len = Math.max(max_len,r-l+1);
        }
        
        return max_len;
    }
}