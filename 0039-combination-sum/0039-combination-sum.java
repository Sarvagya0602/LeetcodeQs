class Solution {
    static void addsum(int[] candidates,int start,int target,List<List<Integer>> result,int n,List<Integer> subresult){
        if(target==0){ 
            result.add(new ArrayList<>(subresult));
            return;
        }
        for(int i=start;i<n;i++){
            if(candidates[i]>target) continue;
            else{
                subresult.add(candidates[i]);
                addsum(candidates,i,target-candidates[i],result,n,subresult);
                subresult.remove(subresult.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        int n=candidates.length;
        List<Integer> subresult=new ArrayList<>();
        addsum(candidates,0,target,result,n,subresult);
        return result;
    }
}