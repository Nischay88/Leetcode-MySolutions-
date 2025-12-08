class Solution {
    public int countTriples(int n) {
        int cnt = 0 ;
       for(int i = 1 ; i<= n ; i++){
        for(int j = i+1 ; j <= n ; j++){

            int c = i*i + j*j;
            int sqrt = (int)Math.sqrt(c);
            if(sqrt <= n && sqrt*sqrt == c){
                cnt = cnt + 2;
            }
        }
       } 
       return cnt;
    }
}