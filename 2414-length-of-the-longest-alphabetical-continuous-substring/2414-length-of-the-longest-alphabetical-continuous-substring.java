class Solution {
    public int longestContinuousSubstring(String s) {
        int cnt = 0 ; 
        int max = 0 ;
        for(int i = 0 ; i < s.length()-1; i++){

            if(s.charAt(i)  == (char)(s.charAt(i+1) - 1)){
                       cnt++;
            } 
            else{
                max = Math.max(max,cnt);
                cnt = 0 ;
            }
        }
        max = Math.max(max,cnt);
        return max +1;
    }
}