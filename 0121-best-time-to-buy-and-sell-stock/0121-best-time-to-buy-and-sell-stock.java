class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==1) return 0;
        int min=prices[0],maxprofit=0;
        for(int i=1;i<n;i++){
            min= (min>=prices[i]) ? prices[i] : min;
            maxprofit = (maxprofit <= (prices[i]-min)) ? prices[i]-min : maxprofit;
        }
        return maxprofit;
    }

}