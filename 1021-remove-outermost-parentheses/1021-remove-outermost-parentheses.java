class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length(),d=-1;
        int[] depth=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') {
                d++;
                depth[i]=d;
            }
            else {
                depth[i]=d;
                d--;
            }
        }
        String result="";
        for(int i=0;i<n;i++){
            if(depth[i]!=0) result+=s.charAt(i);
        }
        return result;
    }
}