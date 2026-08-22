class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,result=Math.max(gain[0],0);
        for(int i=1;i<n;i++){
            gain[i]+=gain[i-1];
            result=Math.max(result,gain[i]);
        }
        return result;
    }
}