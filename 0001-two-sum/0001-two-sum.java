class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(hm.containsKey(c) && (hm.get(c)!=i)){
                return new int[]{i,hm.get(c)};
            }
        }

        return new int[]{};
    }
}