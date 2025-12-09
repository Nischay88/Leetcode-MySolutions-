class Solution {
    public int countPairs(int[] arr) {
        int mod = 1000000007;
        HashMap<Integer, Integer> mp = new HashMap<>();

        int[] pow2 = new int[23];
int num = 1;

for (int i = 0; i < 23; i++) {
    pow2[i] = num;
    num = num * 2;
}

        long ans = 0;

        for (int val : arr) {

            for (int p : pow2) {
                int target = p - val;

                if (mp.containsKey(target)) {
                    ans = (ans + mp.get(target)) % mod;
                }
            }

            mp.put(val, mp.getOrDefault(val, 0) + 1);
        }

        return (int) ans;
    }
}
