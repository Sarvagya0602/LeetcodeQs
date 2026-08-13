class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                    grid[0][0]=1;
                    continue;
                }
                int left=0,top=0;
                if(i>0) left=grid[i-1][j];
                if(j>0) top=grid[i][j-1];
                grid[i][j]=left+top;
            }
        }
        return grid[m-1][n-1];
    }
}