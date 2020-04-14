package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:47
 * @description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int minPrice, maxProfit;
        minPrice = prices[0];
        maxProfit = 0;
        int i;
        for (i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
