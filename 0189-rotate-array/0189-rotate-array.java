class Solution {
    public void revarray(int nums[],int beg,int end){
        while(beg<end){
            int temp=nums[beg];
            nums[beg]=nums[end];
            nums[end]=temp;

            beg++;
            end--;
        }
    }
    // array reverse solution
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        revarray(nums,0,n-k-1);
        revarray(nums,n-k,n-1);
        revarray(nums,0,n-1);
    }
}