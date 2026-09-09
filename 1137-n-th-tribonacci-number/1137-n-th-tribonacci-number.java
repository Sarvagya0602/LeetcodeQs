class Solution {
    public int tribonacci(int n) {
        int[] tribs=new int[n+1];
        if(n<=1) return n;
        tribs[0]=0;
        tribs[1]=1;
        if(n==2) return 1;
        tribs[2]=1;
        for(int i=3;i<=n;i++) tribs[i]=tribs[i-1]+tribs[i-2]+tribs[i-3];
        return tribs[n]; 
        
    }
}