class Solution {
    final static int INF=Integer.MAX_VALUE;
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distances=new int[n];
        int u=0,v=0,w=0;
        for(int i=0;i<n;i++){
            distances[i]=INF;
        }
        distances[k-1]=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<times.length;j++){
                u=times[j][0]-1;
                v=times[j][1]-1;
                w=times[j][2];
                if(distances[u]!=INF)
                    distances[v]=Math.min(distances[v],distances[u]+w);
            }
        }
        int result=Integer.MIN_VALUE;
        for(int d:distances){
            result=Math.max(result,d);
        }

        if(result==INF) return -1;
        return result;
        
    }
}