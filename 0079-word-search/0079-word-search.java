class Solution {
    static boolean isletter(char[][] board, String word,int charno,boolean[][] visit,int i,int j){
        int m=board.length,n=board[0].length;
        
        if(board[i][j]!=word.charAt(charno) || visit[i][j]==true) return false;
        if(charno==word.length()-1) return true;

        visit[i][j]=true;
        boolean top=false,bottom=false,left=false,right=false;

        if(i!=0) top=isletter(board,word,charno+1,visit,i-1,j);
        if(i!=m-1) bottom=isletter(board,word,charno+1,visit,i+1,j);
        if(j!=0) left=isletter(board,word,charno+1,visit,i,j-1);
        if(j!=n-1) right=isletter(board,word,charno+1,visit,i,j+1);
        
        visit[i][j]=false;
        
        return (left || right || top || bottom);
    } 

    public boolean exist(char[][] board, String word) {
        if(word.equals("")) return true;
        boolean result=false;
        int m=board.length,n=board[0].length;

        boolean[][] visit= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)  visit[i][j]=false;    
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result=isletter(board,word,0,visit,i,j);
                if(result) return result;
            }        
        }
        return result;
    }
}
