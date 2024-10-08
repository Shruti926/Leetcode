class Solution {
    public int maxProfit(int[] prices) {
        int  bp = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i =0; i<prices.length; i++)
        {
            if(bp<prices[i])
            {
                int profit = prices[i] - bp;
                max_profit = Math.max(max_profit, profit);
            }
            else{
                bp = prices[i];
            }
        }
        return max_profit;
    }
}