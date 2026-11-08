class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length,diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            diff=Math.min(diff,arr[i+1]-arr[i]);
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]<=diff){
                List<Integer> subresult=new ArrayList<>();
                subresult.add(arr[i]);
                subresult.add(arr[i+1]);
                result.add(subresult);
            }
        }
        return result;
    }
}