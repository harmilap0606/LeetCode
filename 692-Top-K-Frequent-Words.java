class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap<>();

        for(String s : words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }


        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
        if(map.get(a).equals(map.get(b))){
            return a.compareTo(b);
        }
        
        return map.get(b)-map.get(a);
        });

        pq.addAll(map.keySet());
        ArrayList<String> ls = new ArrayList<>();

        while(k>0){
            String s = pq.poll();
            
            ls.add(s);
            k--;
        }

        return ls;


        
    }
}