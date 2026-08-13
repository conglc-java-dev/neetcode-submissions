class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int dateBuy =0; 
        for( int dateSell =1 ; dateSell< prices.length;dateSell++){
            if(prices[dateSell]> prices[dateBuy]){
                maxProfit = maxProfit + (prices[dateSell]- prices[dateBuy]);

            }
           
                dateBuy = dateSell;
            
        }
        return maxProfit;
    }
}