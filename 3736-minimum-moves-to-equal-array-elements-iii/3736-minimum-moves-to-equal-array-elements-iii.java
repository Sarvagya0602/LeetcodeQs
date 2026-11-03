class Solution {
    public int minMoves(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            max=Math.max(i,max);
        }
        return max*nums.length-sum;
        
    }
}