class Solution {
    static void Combination(int start,int n, int k,List<Integer> subresult,List<List<Integer>> result){
        if(k==0) {
            result.add(new ArrayList<>(subresult));
            return;
        }
        for(int i=start;i<=n;i++){
            subresult.add(i);
            Combination(i+1,n,k-1,subresult,result);
            subresult.remove(subresult.size() - 1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subresult=new ArrayList<>();
        
        Combination(1,n,k,subresult,result);
        
        return result;
    }
}