class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        int[] arr=new int[rowIndex+2];

        arr[0]=1;
        arr[1]=0;

        for(int i=0;i<rowIndex;i++){
            int[] temparr=arr.clone();
            int k;
            for(k=1;k<i+1;k++){
                arr[k]=temparr[k]+temparr[k-1];
            }
            arr[k]=1;
        }
        for(int i=0;arr[i]!=0;i++){
            result.add(arr[i]);
        }
        return result;
    }
}