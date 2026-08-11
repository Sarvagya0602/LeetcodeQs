class Solution {
    static void towns(int[][] isConnected,boolean[] visited,int town,int n){
        visited[town]=true;
        for(int j=0;j<n;j++)
            if(isConnected[town][j]==1 && !visited[j]) towns(isConnected,visited,j,n);
    }// here town stands for a node

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        if(n<=1) return n;
        boolean[] visited =new boolean[n];
        for(int i=0;i<n;i++) visited[i]=false;
        int result=0;
        for(int i=0;i<n;i++){
            if(!visited[i]) {
                towns(isConnected,visited,i,n); //towns stand for connected node
                result++;
            }
        }
        return result;
    }
}