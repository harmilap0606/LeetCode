class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(String token : tokens){
            if(token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-") ){
                int b = st.pop();
                int a = st.pop();

                if(token.equals("+")) res = a+b;
                else if(token.equals("-")) res = a-b;
                else if(token.equals("*")) res = a*b;
                else if(token.equals("/")) res = a/b;

                st.push(res);
            }

            else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}