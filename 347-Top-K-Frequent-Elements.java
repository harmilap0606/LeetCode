class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map banao
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Min-heap use karo frequency ke basis par
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for (int num : map.keySet()) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        // Step 3: Result array me elements daalo
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }
        
        return res;
    }
}