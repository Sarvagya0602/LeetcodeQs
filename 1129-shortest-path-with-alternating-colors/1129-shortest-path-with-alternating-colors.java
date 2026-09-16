class Solution {
    public int[] shortestAlternatingPaths(
            int n,
            int[][] redEdges,
            int[][] blueEdges) {

        List<Integer>[] red = new ArrayList[n];
        List<Integer>[] blue = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            red[i] = new ArrayList<>();
            blue[i] = new ArrayList<>();
        }

        for (int[] edge : redEdges) {
            red[edge[0]].add(edge[1]);
        }

        for (int[] edge : blueEdges) {
            blue[edge[0]].add(edge[1]);
        }

        // dist[node][color]
        // color 0 = last edge was red
        // color 1 = last edge was blue
        int[][] dist = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }

        Queue<int[]> queue = new LinkedList<>();

        // Start with both possibilities.
        // This allows the first edge to be either red or blue.
        queue.offer(new int[]{0, 0});
        queue.offer(new int[]{0, 1});

        dist[0][0] = 0;
        dist[0][1] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int node = current[0];
            int lastColor = current[1];

            // If last was red, next must be blue
            if (lastColor == 0) {
                for (int next : blue[node]) {
                    if (dist[next][1] == -1) {
                        dist[next][1] = dist[node][0] + 1;
                        queue.offer(new int[]{next, 1});
                    }
                }
            }

            // If last was blue, next must be red
            else {
                for (int next : red[node]) {
                    if (dist[next][0] == -1) {
                        dist[next][0] = dist[node][1] + 1;
                        queue.offer(new int[]{next, 0});
                    }
                }
            }
        }

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (dist[i][0] == -1) {
                answer[i] = dist[i][1];
            } else if (dist[i][1] == -1) {
                answer[i] = dist[i][0];
            } else {
                answer[i] = Math.min(dist[i][0], dist[i][1]);
            }
        }

        return answer;
    }
}
