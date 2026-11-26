class Solution {
    public int partitionString(String s) {
        int count = 1 ;
        Stack<Character> st = new Stack<>();
        for( char c : s.toCharArray() ){
            if(st.contains(c)){
                count++;
                st.clear();
                st.push(c);
            }

            else st.push(c);
        }

        return count;
    }
}