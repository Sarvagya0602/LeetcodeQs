class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int INF = 1_000_000_000;

        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            dist[u][v] = w;
            dist[v][u] = w;
        }
        
        for (int via = 0; via < n; via++) {
            for (int from = 0; from < n; from++) {
                for (int to = 0; to < n; to++) {

                    if (dist[from][via] != INF &&
                        dist[via][to] != INF) {

                        dist[from][to] = Math.min(
                            dist[from][to],
                            dist[from][via] + dist[via][to]
                        );
                    }
                }
            }
        }

        int answer = -1;
        int minCount = Integer.MAX_VALUE;

        for (int city = 0; city < n; city++) {
            int count = 0;

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (city != neighbor &&
                    dist[city][neighbor] <= distanceThreshold) {
                    count++;
                }
            }

            // <= is important because we want the larger city
            // when counts are equal.
            if (count <= minCount) {
                minCount = count;
                answer = city;
            }
        }

        return answer;
    }
}
