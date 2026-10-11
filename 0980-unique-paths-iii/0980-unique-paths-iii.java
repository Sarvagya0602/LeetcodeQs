class Solution {
    private int count = 0;
    private int empty = 0;
    private int startX, startY;
    private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 0) {
                    empty++;
                }
            }
        }

        dfs(grid, startX, startY, 0);
        return count;
    }

    private void dfs(int[][] grid, int x, int y, int visited) {
        if (grid[x][y] == 2) {
            if (visited == empty + 1) {
                count++;
            }
            return;
        }

        int temp = grid[x][y];
        grid[x][y] = -1;
        visited++;

        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            if (nx >= 0 && nx < grid.length &&
                ny >= 0 && ny < grid[0].length &&
                grid[nx][ny] != -1) {
                dfs(grid, nx, ny, visited);
            }
        }

        grid[x][y] = temp;
    }
}