public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int highPrice = Integer.MAX_VALUE;
        int overall = 0;
        int profit = 0;

        for(int i = 0;i < prices.length; i++) {
            if (prices[i] < highPrice) {
                highPrice = prices[i];
            }
            profit = prices[i] - highPrice;
            if(overall < profit) {
                overall = profit;
            }
        }
        return overall;
    }
}
