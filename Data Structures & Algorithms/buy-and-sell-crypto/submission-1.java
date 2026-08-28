class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minbuy=prices[0];
        for(int i=0;i<prices.length;i++){
            maxprofit=Math.max(maxprofit,prices[i]-minbuy);
            minbuy=Math.min(prices[i],minbuy);
        }
        return maxprofit;
        
    }
}
