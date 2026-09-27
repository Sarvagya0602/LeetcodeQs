class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int target = (1 << n) - 1;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][1 << n];

        for (int i = 0; i < n; i++) {
            int mask = 1 << i;
            q.offer(new int[]{i, mask});
            visited[i][mask] = true;
        }

        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] curr = q.poll();
                int node = curr[0];
                int mask = curr[1];

                if (mask == target) {
                    return steps;
                }

                for (int next : graph[node]) {
                    int newMask = mask | (1 << next);

                    if (!visited[next][newMask]) {
                        visited[next][newMask] = true;
                        q.offer(new int[]{next, newMask});
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}