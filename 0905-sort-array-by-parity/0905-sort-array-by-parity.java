class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int e=0,o=n-1;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0) result[e++]=nums[i];
            else result[o--]=nums[i];
        }
        return result;
    }
}