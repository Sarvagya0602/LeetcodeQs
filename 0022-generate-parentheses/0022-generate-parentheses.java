class Solution {
    static List<String> result=new ArrayList<>();
    static void generate(int n,String subresult,int count){
        if(count<0) return;
        if(subresult.length()==(n*2)){
            if(count==0)
                result.add(new String(subresult));
            return;
        }
        generate(n,subresult+'(',count+1);
        generate(n,subresult+')',count-1);
    }
    public List<String> generateParenthesis(int n) {
        result.clear();
        generate(n,"",0);
        return result;
    }
}