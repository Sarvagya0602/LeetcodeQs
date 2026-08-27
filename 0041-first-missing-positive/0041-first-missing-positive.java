class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hash=new HashSet<>();
        int r=1;
        for(int i:nums) hash.add(i);
        while(hash.contains(r)) r++;
        return r;
    }
}