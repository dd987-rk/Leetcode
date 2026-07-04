class Solution {
    int[] rt;

    private int find(int x) {
        if (rt[x] != x) {
            rt[x] = find(rt[x]);
        }
        return rt[x];
    }

    public int minScore(int n, int[][] roads) {
        rt = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            rt[i] = i;
        }

        for (int[] road : roads) {
            int x = road[0];
            int y = road[1];

            rt[find(x)] = find(y);
        }

        int res = 1_000_000_000;
        int g1 = find(1);

        for (int[] road : roads) {
            int x = road[0];
            int d = road[2];

            if (find(x) == g1) {
                res = Math.min(res, d);
            }
        }

        return res;
    }
}