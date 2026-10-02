class Solution {
    static void generate(int n,String subresult,int count,List<String> result){
        if(count<0) return;
        if(subresult.length()==(n*2)){
            if(count==0)
                result.add(new String(subresult));
            return;
        }
        generate(n,subresult+'(',count+1,result);
        generate(n,subresult+')',count-1,result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generate(n,"",0,result);
        return result;
    }
}