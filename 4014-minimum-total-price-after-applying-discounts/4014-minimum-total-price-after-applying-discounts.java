class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double result=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double p,d;

        int pmax=prices.length-1,dmax=discounts.length-1;
        while(pmax>=0 && dmax>=0){
            p=(double)prices[pmax--];
            d=(double)discounts[dmax--];
            result+=(p * (100 - d))/100;
        }
        while(pmax>=0){
            p=(double)prices[pmax--];
            result+=p;
        }
        return result;
    }
}