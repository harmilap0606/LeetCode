class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int st : students){
            q.add(st);
        }

        int s1 = 0;
        int rot = 0;

        while(!q.isEmpty() && rot<q.size()){
            if(q.peek() == sandwiches[s1]){
                q.poll();
                s1++;
                rot=0;
            }

            else{
                q.add(q.poll());
                rot++;
            }
        }

        return q.size();
        
    }
}