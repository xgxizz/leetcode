package priv.xgx.数组双指针._123_买卖股票的最佳时机III;

class Solution {
    public int maxProfit(int[] prices) {

        int[][] dp = new int[prices.length][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 第一次持有
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            // 第一次不持有
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            // 第二次持有
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            // 第二次不持有
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[prices.length - 1][4];
    }

    public static void main(String[] args) {
        // int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        // int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int maxProfit = new Solution().maxProfit(prices);
        System.out.println(maxProfit);
    }
}