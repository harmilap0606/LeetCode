// class Solution {


//     boolean isVowel(char c){
//             if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
//             return false;
//         }

//     public int maxVowels(String s, int k) {

//         int count = 0;
//         int vowel_count = 0;
//         for(int i = 0 ; i < k ; i++){
//             char ch = s.charAt(i);
//             if(isVowel(ch)) vowel_count++;
//         }
//         int max_count = vowel_count;

//         for(int i = k ; i < s.length() ; i++){
            
//             if(isVowel(s.charAt(i-k))) vowel_count--;

//             if(isVowel(s.charAt(i))) vowel_count++;

//             max_count = Math.max(max_count,vowel_count);

//         }

//         return max_count;


        
//     }
// }


class Solution {

    boolean isVow(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0 ;

        for(int i = 0 ;  i < k ; i++){
            if(isVow(s.charAt(i))) count++;
        }

        max = count;

        for(int i = k ;  i < s.length() ; i++){
            if(isVow(s.charAt(i))) count++;
            if(isVow(s.charAt(i-k))) count--;

            if(count>max) max = count;
        }

        return max;
    }
}