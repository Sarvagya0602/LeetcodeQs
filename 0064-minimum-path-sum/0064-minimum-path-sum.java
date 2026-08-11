class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length ,n=grid[0].length;
        int[][] distancegrid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                if(i==0 && j==0)  distancegrid[i][j]=val;
                else{
                    int left=Integer.MAX_VALUE,up=Integer.MAX_VALUE;
                    if(i>0) up=val+distancegrid[i-1][j];
                    if(j>0) left=val+distancegrid[i][j-1];
                    distancegrid[i][j]=Math.min(up,left);
                }
            }
        }
        return distancegrid[m-1][n-1];
    }
}