class Solution {
    public int countCommas(int n) {
        int result=0;
        int i=1;
        int c=0,k=1000;
        while(i<=n){
            if(k<=n) {
                result+=(k-i)*c++;
                i=k;}
            else{
                result+=(n-i+1)*c++;
                i=n+1;
            }
            k*=1000;
        }
        return result;
    }
}