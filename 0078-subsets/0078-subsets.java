class Solution {

    static void subsetsrec(int[] nums, List<List<Integer>> result,int start, List<Integer> ls) {

        result.add(new ArrayList<>(ls));
        for (int i = start; i < nums.length; i++) {
            ls.add(nums[i]);
            subsetsrec(nums, result, i + 1, ls);
            ls.remove(ls.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        subsetsrec(nums, result, 0, ls);
        return result;
    }
}