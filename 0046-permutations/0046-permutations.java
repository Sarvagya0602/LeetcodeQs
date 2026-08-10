class Solution {
    static void permuterec(int[] nums,List<List<Integer>> result,List<Integer> ls,boolean[] visit){
        if(ls.size()==nums.length){
            result.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                visit[i]=true;
                ls.add(nums[i]);
                permuterec(nums,result,ls,visit);
                ls.remove(ls.size()-1);
                visit[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        boolean[] visit=new boolean[nums.length];
        permuterec(nums,result,ls,visit);
        return result;
    }
}