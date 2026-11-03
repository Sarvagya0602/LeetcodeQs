class Solution {
    final static int INF=Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        int[] amounts=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            amounts[i]=INF;
        }
        amounts[0]=0;
        for(int c:coins){
            for(int i=c;i<amount+1;i++){
                if(amounts[i-c]!=INF)
                    amounts[i]=Math.min(amounts[i],amounts[i-c]+1);
            }
        }
        if(amounts[amount]==INF) return -1;
        return amounts[amount];
    }
}