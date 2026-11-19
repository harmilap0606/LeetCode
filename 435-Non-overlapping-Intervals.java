class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[1]-b[1]
        );

        for(int[] i : intervals) pq.offer(i);

        int[] first = pq.poll();
        int removed = 0;
        int prevEnd=first[1];

        while(!pq.isEmpty()){
            int x[] = pq.poll();
            int currStart = x[0];

            if(currStart>=prevEnd) prevEnd=x[1];
            else removed++;
        }

        return removed;


    }
}