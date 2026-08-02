class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int[] arr=new int[numRows+1];

        arr[0]=1;
        arr[1]=0;

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                row.add(arr[j]);
            }
            result.add(row);
            int[] temparr=arr.clone();
            int k;
            for(k=1;k<i+1;k++){
                arr[k]=temparr[k]+temparr[k-1];
            }
            arr[k]=1;
        }
        return result;
    }
}