class Solution {
    static void island(char[][] grid,int i,int j,int m,int n){
        if(grid[i][j]=='0') return;
        grid[i][j]='0';

        if (i != 0) island(grid, i-1, j, m, n);
        if (j!=0) island(grid,i,j-1,m,n);    
        if(j!=n-1) island(grid,i,j+1,m,n);    
        if(i!=m-1) island(grid,i+1,j,m,n);   
    }
    public int numIslands(char[][] grid) {
        int result=0,m=grid.length,n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') {
                    island(grid,i,j,m,n);
                    result++;
                }
            }
        }
        return result;
    }
}