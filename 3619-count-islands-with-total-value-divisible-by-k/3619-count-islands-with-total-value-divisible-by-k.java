class Solution {
    static long dfs(int[][] grid,int i,int j,long sum,int m,int n){
        if(grid[i][j]==0) return 0;

        sum+=grid[i][j];
        grid[i][j]=0;

        
        if(i!=0) sum+=dfs(grid,i-1,j,0,m,n);
        if(j!=0) sum+=dfs(grid,i,j-1,0,m,n);
        if(i!=m-1) sum+=dfs(grid,i+1,j,0,m,n);
        if(j!=n-1) sum+=dfs(grid,i,j+1,0,m,n);
        
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int m =grid.length,n =grid[0].length;
        int result=0;
        long s=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    s=dfs(grid,i,j,0,m,n);
                    if(s%k==0) result++;
                }
            }
        }
        return result;
    }
}