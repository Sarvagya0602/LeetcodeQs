class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=nums[0],max=nums[0],minindex=0,maxindex=0;
        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }

            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }
        int left = Math.max(minindex, maxindex) + 1; 

        int right = Math.max(n - minindex, n - maxindex); 

        int leftright = Math.min(
            minindex + 1 + (n - maxindex),
            maxindex + 1 + (n - minindex)
        ); 

        return Math.min(leftright, Math.min(left, right));
    }
}