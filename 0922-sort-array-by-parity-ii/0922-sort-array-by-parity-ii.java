class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length,e=0,o=1;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) {
                result[e]=nums[i];
                e+=2;
            } else {
                result[o]=nums[i];
                o+=2;
            }
        }
        return result;
    }
}