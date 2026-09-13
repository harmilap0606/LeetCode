class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();

        int count = 0;

        for(int i = 0 ; i < word.length() ; i++){
            if(i>=0 && i<8) count+=1;
            else if(i>=8 && i<16) count+=2;
            else if(i>=16 && i<24) count+=3;
            else count+=4;
        }
        
        return count;
    }
}