class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE; 
        int total = 0;
        int cnt = 0 ;
        int i = 0 ; 
        int j = 0 ;
        while(j < blocks.length()){

            total++;

            if(blocks.charAt(j) == 'W'){
                cnt++;
            }

            while(total > k){

                if(blocks.charAt(i) == 'W'){
                    cnt--;
                }
                total--;
                i++;
            }
            
            if(total == k){
            ans = Math.min(ans,cnt);
            }
            j++;

    }

    return ans;
}
}