class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,prefix=1,suffix=1;
        int[] prefixarr= new int[n],suffixarr= new int[n],result= new int[n];
        for(int i=0;i<n;i++){
            prefixarr[i]=prefix;
            prefix*=nums[i];

            suffixarr[n-i-1]=suffix;
            suffix*=nums[n-i-1];
        }
        for(int i=0;i<n;i++)
            result[i]=prefixarr[i]*suffixarr[i];

        return result;
    }
}