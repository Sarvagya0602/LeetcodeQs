
class Solution {
    
    public boolean rowrep(char[][] board){
    Set<Character> nos=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(nos.contains(board[i][j])) return false;
                    nos.add(board[i][j]);
                }
            }
            nos.clear();
        }
        nos.clear();
        return true;
    }

    public boolean colrep(char[][] board){
    Set<Character> nos=new HashSet<>();    
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i] != '.'){
                    if(nos.contains(board[j][i])) return false;
                    nos.add(board[j][i]);
                }
            }
            nos.clear();
        }
        return true;
    }

    public boolean boxrep(char[][] board){
    Set<Character> nos=new HashSet<>();
        for(int n=0;n<9;n=n+3){
            for(int k=0;k<9;k=k+3){
                for(int i=n;i<n+3;i++){
                    for(int j=k;j<k+3;j++){
                        if(board[i][j] != '.'){
                            if(nos.contains(board[i][j])) return false;
                            nos.add(board[i][j]);
                        }
                    }
                }
                nos.clear();
            }
        }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        return (rowrep(board) && colrep(board) && boxrep(board));
    }
}