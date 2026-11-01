class Solution {
    final static int INF=Integer.MAX_VALUE;
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dm=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dm[i][j]=0;
                else dm[i][j]=INF;
            }
        }
        for(int i=0;i<edges.length;i++){
            dm[edges[i][0]][edges[i][1]]=edges[i][2];
            dm[edges[i][1]][edges[i][0]]=edges[i][2];
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(dm[i][k]!=INF && dm[k][j]!=INF){
                            dm[i][j]=Math.min(dm[i][j],dm[i][k]+dm[k][j]);
                        }
                    }
            }
        }

        int result=-1,city=INF,sum=0;
        
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<n;j++){
                if(i!=j && dm[i][j]<=distanceThreshold) sum++;
            }
            if(sum<=city){
                city=sum;
                result=i;
            }
        }

        return result;
    }
}