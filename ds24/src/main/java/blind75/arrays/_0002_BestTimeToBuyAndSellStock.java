package blind75.arrays;

public class _0002_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int start = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < start) {
                start = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - start);
        }
        return maxProfit;
    }
}
