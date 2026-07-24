class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int maxprofit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                profit = prices[i] - buy;
            }

            maxprofit = Math.max(profit, maxprofit);
        }
        return maxprofit;
    }
}