class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int r=k;
        for(int i:nums){
            if(i==r) r+=k;
        }
        return r;
        
    }
}