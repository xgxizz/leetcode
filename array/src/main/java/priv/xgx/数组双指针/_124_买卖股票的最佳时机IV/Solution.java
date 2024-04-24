package priv.xgx.数组双指针._124_买卖股票的最佳时机IV;

class Solution {
    public int maxProfit(int k, int[] prices) {

        int[][] dp = new int[prices.length][2 * k + 1];
        for (int i = 1; i < 2 * k; i += 2) {
            dp[0][i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < 2 * k - 1; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }

        }
        return dp[prices.length - 1][4];
    }

    public static void main(String[] args) {
        // int[] prices = new int[]{2, 4, 1};
        // int k = 2;
        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        int k = 2;

        int maxProfit = new Solution().maxProfit(k, prices);
        System.out.println(maxProfit);
    }
}