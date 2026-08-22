class Solution {
    public int pivotInteger(int n) {
        int suffix=(n*(n+1))/2,prefix=0;
        if(n==1) return 1;
        for(int i=0;i<n;i++){
            prefix+=i;
            if(prefix==suffix) return i;
            suffix-=i;
        }
        return -1;
    }
}