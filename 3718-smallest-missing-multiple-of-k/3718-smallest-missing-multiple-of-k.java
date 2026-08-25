class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hashs=new HashSet<>();
        for(int i:nums) hashs.add(i);
        int result=k;
        while(hashs.contains(result)) result+=k;
        return result;

    }
}