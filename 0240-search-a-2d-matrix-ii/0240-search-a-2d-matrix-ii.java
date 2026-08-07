class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;

        int rowno=0,colno=n-1;
        while(rowno<m && colno>=0){
            if(matrix[rowno][colno]==target) return true;
            else if(matrix[rowno][colno]<target) rowno++;
            else colno--;
        }
        return false;
    }
}