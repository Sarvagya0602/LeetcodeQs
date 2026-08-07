class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowno=0,colno=matrix[0].length-1;
        while(rowno<matrix.length && colno>=0){
            if(matrix[rowno][colno]==target) return true;
            else if(matrix[rowno][colno]<target) rowno++;
            else colno--;
        }
        return false;
    }
}