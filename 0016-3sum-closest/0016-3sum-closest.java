class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=0,closeness=20000;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return target;
                else if(sum<target){
                    if(Math.abs(target-sum)<=closeness){
                        closeness=Math.abs(target-sum);
                        result=sum;
                    }
                    j++;
                }else{
                    if(Math.abs(target-sum)<=closeness){
                        closeness=Math.abs(target-sum);
                        result=sum;
                    }
                    k--;
                }
            }
        }
        return result;
    }
}