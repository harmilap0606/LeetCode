class Solution {
    public int minimumPushes(String word) {
        ArrayList<Character> ls = new ArrayList<>();
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            ls.add(c);
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < ls.size() ; i++){
            map.put(ls.get(i),map.getOrDefault(ls.get(i),0)+1);
        }
        
        ls.sort((a,b)->map.get(b)-map.get(a));

        // Collections.sort(ls,(a,b)->map.get(b)-map.get(a));

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i = 0 ; i < ls.size() ; i++ ){
            set.add(ls.get(i));
        }

        int ind = 0;
        int count = 0;
        for(char c : set){
            if(ind<8){
                count+=map.get(c)*1;
                ind++;
            }

            else if(ind<16){
                count+=map.get(c)*2;
                ind++;
            }

            else if(ind<24){
                count+=map.get(c)*3;
                ind++;
            }

            else{
                count+=map.get(c)*4;
                ind++;
            }
        }


        
        return count;


    }
}