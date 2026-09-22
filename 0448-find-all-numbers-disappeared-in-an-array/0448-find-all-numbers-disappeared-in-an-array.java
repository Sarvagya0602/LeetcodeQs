class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        Set<Integer> setnums=new HashSet<>();
        for(int i:nums) setnums.add(i);
        for(int i=1;i<=nums.length;i++)
            if(!setnums.contains(i)) result.add(i);
        return result;
    }
}