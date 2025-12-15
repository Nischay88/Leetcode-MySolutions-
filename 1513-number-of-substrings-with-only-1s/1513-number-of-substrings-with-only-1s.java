class Solution {
    public int numSub(String s) {
        int j = 0;
        long sum = 0;      
        long cnt = 0;      
        int mod = 1000000007;

        while (j < s.length()) {
            if (s.charAt(j) == '1') {
                cnt++;
            } else {
                if (cnt > 0) {
                    sum = (sum + (cnt * (cnt + 1) / 2) % mod) % mod;
                    cnt = 0;
                }
            }
            j++;
        }

        
        if (cnt > 0) {
            sum = (sum + (cnt * (cnt + 1) / 2) % mod) % mod;
        }

        return (int) sum;
    }
}
