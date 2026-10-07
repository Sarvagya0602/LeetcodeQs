class Solution {
    static int n;
    static int[] qColumns;
    static boolean[] columns,d1,d2;
    static int result;

    static void solverow(int row,int n){
        if(row==n){
            result++;
            return;
        }

        for(int col=0;col<n;col++){
            int D1 = row-col+n-1,D2=row+col;
            if (!columns[col] && !d1[D1] && !d2[D2]) {
                qColumns[row] = col;
                columns[col] = d1[D1] = d2[D2] = true;
                solverow(row+1,n);
                columns[col] = d1[D1] = d2[D2] = false;
            }
        }
    }
    

    public int totalNQueens(int n) {
        result=0;
        qColumns = new int[n];
        columns = new boolean[n];
        d1 = new boolean[2*n-1];
        d2 = new boolean[2*n-1];
        solverow(0,n);
        return result;
    }
}
