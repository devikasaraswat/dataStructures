class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
         int minProfit = prices[0];

        for(int currentPrice : prices) {

            profit = Math.max(profit, currentPrice- minProfit);
            minProfit = Math.min (minProfit, currentPrice);
        }
        return profit;
    }
}