class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,n=nums.length;
        while(nums[j]!=0){
            j++;
            if(j==n) return;
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                
                //swap function
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];

                j++;
            }
        }
        return;
    }
}