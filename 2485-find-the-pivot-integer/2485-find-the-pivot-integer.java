class Solution {
    public int pivotInteger(int n) {
        int suffix=(n*(n+1))/2,prefix=0;
        if(n==1) return 1;
        for(int i=0;i<n;i++){
            prefix+=i;
            suffix-=i;
            if(prefix==suffix+i) return i;
        }
        return -1;
    }
}