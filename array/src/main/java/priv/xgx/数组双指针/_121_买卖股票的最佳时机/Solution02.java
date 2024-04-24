package priv.xgx.数组双指针._121_买卖股票的最佳时机;

class Solution02 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = new Solution02().maxProfit(prices);
        System.out.println(maxProfit);
    }
}