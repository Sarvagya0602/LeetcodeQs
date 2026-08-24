class NumArray {
    int[] numArray;

    public NumArray(int[] nums) {
        this.numArray=new int[nums.length];
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            numArray[i]=prefix;
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return numArray[right];
        return numArray[right]-numArray[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */