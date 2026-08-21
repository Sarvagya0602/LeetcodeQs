class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix=0,suffix=0,n=nums.length;
        int[] prefixarr =new int[n],suffixarr=new int[n],result =new int[n];
        for(int i=0;i<n;i++){
            prefixarr[i]=prefix;
            prefix+=nums[i];

            suffixarr[n-i-1]=suffix;
            suffix+=nums[n-i-1];
        }
        for(int i=0;i<n;i++)
            result[i]=Math.abs(prefixarr[i]-suffixarr[i]);

        return result;
    }
}