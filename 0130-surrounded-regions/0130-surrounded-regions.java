class Solution {
    static void edgearea(char[][] board,boolean[][] isedge,int i,int j,int m,int n){
        if(isedge[i][j]==true || board[i][j]=='X') return;
        isedge[i][j]=true;

        if(i!=0) edgearea(board,isedge,i-1,j,m,n);
        if(i!=m-1) edgearea(board,isedge,i+1,j,m,n);
        if(j!=0) edgearea(board,isedge,i,j-1,m,n);
        if(j!=n-1) edgearea(board,isedge,i,j+1,m,n);
    }
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;

        boolean[][] isedge= new boolean[m][n];
    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if((i==0 || i==m-1 || j==0 || j==n-1) && board[i][j]=='O')
                    edgearea(board,isedge,i,j,m,n);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(!isedge[i][j] && board[i][j]=='O')
                    board[i][j]='X';
            }
        }

    }
}