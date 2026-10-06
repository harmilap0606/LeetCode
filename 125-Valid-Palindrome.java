class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        
        // for(int i = 0 ; i < s.length() ; i++){
        //     char c = s.charAt(i);
        //     if(c>='a' && c<='z' || c>='A' && c<='Z'|| c>='0' && c<='9') sb.append(Character.toLowerCase(c));
        // }

        // int i = 0 , j = sb.length()-1;

        // while(i<=j){
        //     if(sb.charAt(i)!=sb.charAt(j)) return false;
        //     i++;
        //     j--;
        // }

        // return true;



        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }

        return true;
        
    }
}