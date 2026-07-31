class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxProfit = 0;
        for (int sell = 1; sell < prices.length; sell++) {
        
         maxProfit= Math.max( prices[sell]-prices[buy],maxProfit) ;
         if(prices[sell]<prices[buy]){
            buy=sell;   // tim duoc ngay mua thap nhat 
         }

        }
        return maxProfit;
    }
}
