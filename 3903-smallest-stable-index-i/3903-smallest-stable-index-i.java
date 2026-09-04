class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suffix=new int[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-1;i>0;i--){
            suffix[i-1]=Math.min(nums[i-1],suffix[i]);
        }
        int prefix=nums[0];
        for(int j=0;j<n;j++){
            prefix=Math.max(prefix,nums[j]);
            if(prefix-suffix[j]<=k) return j; 
        }
        return -1;
    }
}