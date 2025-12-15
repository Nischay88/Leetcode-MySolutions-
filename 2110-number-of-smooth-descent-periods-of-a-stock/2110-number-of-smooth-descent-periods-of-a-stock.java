class Solution {
    public long getDescentPeriods(int[] prices) {

        int j = 0;
        long sum = 0;
        int cnt = 0;
        long ans = 0;

        while (j < prices.length) {

            if (j != prices.length - 1 && prices[j] - prices[j + 1] == 1) {
                cnt++;
            } else {
                if (cnt > 0) {
                    ans = ans + cnt + 1;
                    long n = cnt + 1;
                    sum = sum + (n * (n + 1) / 2);
                    cnt = 0;
                }
            }
            j++;
        }

        long x = prices.length - ans;
        return sum + x;
    }
}
