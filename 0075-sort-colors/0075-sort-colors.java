class Solution {
    public void sortColors(int[] nums) {
        int[] count={0,0,0};
        for(int i=0;i<nums.length;i++)  count[nums[i]]++;
        int p=0;
        for(int j=0;j<count.length;j++){
            for(int i=0;i<count[j];i++)  nums[p++]=j;
        }
    }
}