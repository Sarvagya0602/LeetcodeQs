class Solution {
    static double binarypower(double x, long n){
        if(n==0) return 1;
        else if(n==1) return x;
        return binarypower(x*x,n/2)*binarypower(x,n%2);
    }
    public double myPow(double x, int n) {
        if(x==0 || x==1) return x;
        if(n==0) return 1;
        boolean isneg=false;
        if(x<0 && n%2==1){
            isneg=true;
            x*=-1;
        }
        double result=0;
        Long N=(long)n;
        if(n<0)  result=1/binarypower(x,-N);
        else result=binarypower(x,N);
        
        if(isneg) result*=-1;
        return result;
    }
}