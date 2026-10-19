class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Stack<Integer> st = new Stack<>();

        // for(int a : asteroids ){
        //     boolean isSame = false;
        //     if(a>0) st.push(a);

        //     else{
        //         while(!st.isEmpty() && st.peek()>0 && a<0){
        //             if(Math.abs(a)>st.peek()) {
        //                 st.pop();
        //             }

        //             else if(Math.abs(a)==st.peek()) {
        //                 isSame = true;
        //                 st.pop();
        //                 break;
        //             }
                    
        //             else{
        //                 isSame = true;
        //                 break;
        //             }
        //         }

        //         if(!isSame)st.push(a);
        //     }
        // }

        // int[] res = new int[st.size()];
        // for (int i = res.length - 1; i >= 0; i--) {
        //     res[i] = st.pop();
        // }
        
        // return res;

// ---------------------------------------------
        // logic
        // stack
        // har ek aestoid klia:
        // agr vo +ve hum usko stack mei push krdenge
        // agr co -ve ja ro check stack ke top pe +ve ha ya nhi
        // agr opposite dir to collide kragay
        // chota aestroid hoga usko destroy kregay
        
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            boolean alive = true;
            while(alive && a<0 &&!st.isEmpty() && st.peek()>0){
                if(st.peek()<-a) st.pop();
                else if(st.peek() == -a){
                    st.pop();
                    alive = false;
                }
                else alive = false;
            }

            if(alive) st.push(a);
        }


        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        
        return res;

    }
}