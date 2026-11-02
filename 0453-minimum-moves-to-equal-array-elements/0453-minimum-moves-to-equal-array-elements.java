class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE,result=0;
        for(int n:nums){
            result+=n;
            min=Math.min(min,n);
        }    
        return result-nums.length*min;
        
    }
}