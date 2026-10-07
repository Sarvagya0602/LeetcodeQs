import java.util.*;

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] dislike : dislikes) {
            int a = dislike[0];
            int b = dislike[1];

            graph[a].add(b);
            graph[b].add(a);
        }

        int[] color = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (color[i] != 0) continue;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 1;

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int neighbor : graph[current]) {
                    if (color[neighbor] == color[current]) {
                        return false;
                    }

                    if (color[neighbor] == 0) {
                        color[neighbor] = -color[current];
                        queue.offer(neighbor);
                    }
                }
            }
        }

        return true;
    }
}
