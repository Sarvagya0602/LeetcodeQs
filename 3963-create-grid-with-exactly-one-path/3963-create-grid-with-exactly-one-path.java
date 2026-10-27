class Solution {
    public String[] createGrid(int m, int n) {
        String[] result=new String[m];
        String subresult;
        for(int i=0;i<m;i++){
            subresult="";
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1) subresult+=".";
                else subresult+="#";
            }
            result[i]=subresult;
        }
        return result;
    }
}