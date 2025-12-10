class Solution {
public int fn(int n ){
        long fact = 1;
        long mod = 1000000007;
        while(n > 1){
            fact = (fact * n) % mod;
            n = n - 1;
        }
        return (int)fact;
    }
    public int countPermutations(int[] complexity) {
        int mod = 1000000007;
        int cnt = 0 ;
        for(int i = 1 ; i < complexity.length; i++){

            if(complexity[0] < complexity[i]){
                cnt++;
            }
        }
        int fact = 0 ;   
        if(cnt == complexity.length-1){
            return fn(complexity.length-1);
            
        }

        return 0;
    }
}