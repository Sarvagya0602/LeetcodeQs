class Solution {
    static int n;
	static int[] qColumns;
	static boolean[] columns,d1,d2;
    static List<List<String>> result;

    static void solverow(int row,int n){
        if(row==n){
            addResult(n);
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
    static void addResult(int n){
        List<String> subresult=new ArrayList<>();
        for (int r=0; r<n;r++) {
            String s=new String();
			for (int c=0;c<n;c++) {
				if(qColumns[r]==c) s+='Q';
                else s+='.';
			}
			subresult.add(s);
		}
		result.add(subresult);
    }

    public List<List<String>> solveNQueens(int n) {
        result=new ArrayList<>();
        qColumns = new int[n];
		columns = new boolean[n];
		d1 = new boolean[2*n-1];
		d2 = new boolean[2*n-1];
        solverow(0,n);
        return result;
    }
}