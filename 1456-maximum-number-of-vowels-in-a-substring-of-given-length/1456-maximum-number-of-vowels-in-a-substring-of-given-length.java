class Solution {
    public int maxVowels(String s, int k) {
        
        int i = 0 ;
        int j = 0 ; 
        int cnt = 0 ;
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        while(j < s.length()){
             sum++;
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
                cnt++;
            }

            while(sum > k){

                
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                cnt--;
                }

                 sum--;
                 i++;;
            }

            max = Math.max(max,cnt);
            j++;
        }
        return max;
    }
}