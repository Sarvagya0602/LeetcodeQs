class Solution {
    static int findarea(int[][] grid,int i,int j,int m,int n){
        if(grid[i][j]==0) return 0;
        grid[i][j]=0;

        int leftarea=0,rightarea=0,toparea=0,bottomarea=0;

        if(i!=0) leftarea=findarea(grid,i-1,j,m,n);
        if(i!=m-1) rightarea=findarea(grid,i+1,j,m,n);
        if(j!=n-1) bottomarea=findarea(grid,i,j+1,m,n);
        if(j!=0) toparea=findarea(grid,i,j-1,m,n);

        return 1+leftarea+rightarea+toparea+bottomarea;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        int m =grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    area=Math.max(findarea(grid,i,j,m,n),area);
            }
        }
        return area;
    }
}