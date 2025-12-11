class Solution {
    public int countCoveredBuildings(int n, int[][] b) {

        int[] rmax = new int[n + 1];
        int[] rmin = new int[n + 1];
        int[] cmax = new int[n + 1];
        int[] cmin = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            rmin[i] = n + 1;
            cmin[i] = n + 1;
        }
       
        for (int[] build : b) {
            int x = build[0];
            int y = build[1];

            rmax[y] = Math.max(rmax[y], x);
            rmin[y] = Math.min(rmin[y], x);
            cmax[x] = Math.max(cmax[x], y);
            cmin[x] = Math.min(cmin[x], y);
        }

        int ans = 0;

        for (int[] build : b) {
            int x = build[0];
            int y = build[1];

            if (rmin[y] < x && x < rmax[y] && cmin[x] < y && y < cmax[x]) {
                ans++;
            }
        }

        return ans;
    }
}
