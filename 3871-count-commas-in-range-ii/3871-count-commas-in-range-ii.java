class Solution {
    public long countCommas(long n) {
        long result=0,c=0,k=1000,i=1;
        while(i<=n){
            if(k<=n) {
                result+=(k-i)*c++;
                i=k;
            } else{
                result+=(n-i+1)*c++;
                i=n+1;
            }
            k*=1000;
        }
        return result;
    }
}