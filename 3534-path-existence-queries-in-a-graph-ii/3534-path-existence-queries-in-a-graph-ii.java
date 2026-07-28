class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        // Step 1: sort indices by value
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> nums[a] - nums[b]);

        int[] sortedNums = new int[n];
        int[] origToSorted = new int[n]; // original index -> position in sorted order
        for (int i = 0; i < n; i++) {
            sortedNums[i] = nums[order[i]];
            origToSorted[order[i]] = i;
        }

        // Step 2: two-pointer -> farthest node reachable in exactly 1 hop from sorted position i
        int LOG = 18; // 2^17 > 1e5
        int[][] jump = new int[n][LOG];
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (right < i) right = i;
            while (right + 1 < n && sortedNums[right + 1] - sortedNums[i] <= maxDiff) right++;
            jump[i][0] = right;
        }

        // Step 3: binary lifting table
        for (int level = 1; level < LOG; level++) {
            for (int i = 0; i < n; i++) {
                jump[i][level] = jump[jump[i][level - 1]][level - 1];
            }
        }

        // Step 4: answer queries using binary lifting (like "jump game" min steps)
        int[] ans = new int[queries.length];
        for (int qi = 0; qi < queries.length; qi++) {
            int u = origToSorted[queries[qi][0]];
            int v = origToSorted[queries[qi][1]];
            if (u > v) { int tmp = u; u = v; v = tmp; }

            if (u == v) {
                ans[qi] = 0;
                continue;
            }
            if (jump[u][0] >= v) {
                ans[qi] = 1;
                continue;
            }

            int steps = 0;
            int cur = u;
            for (int level = LOG - 1; level >= 0; level--) {
                if (jump[cur][level] < v) {
                    cur = jump[cur][level];
                    steps += (1 << level);
                }
            }
            // one more hop needed after greedy jumps
            if (jump[cur][0] >= v) {
                ans[qi] = steps + 1;
            } else {
                ans[qi] = -1; // disconnected
            }
        }
        return ans;
    }
}