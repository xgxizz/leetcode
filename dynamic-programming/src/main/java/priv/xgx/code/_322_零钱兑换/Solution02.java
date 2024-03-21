package priv.xgx.code._322_零钱兑换;

/**
 * 暴力求解
 */
class Solution02 {
    // 状态：目标金额amount
    // 选择：coins数组中列出的所有硬币面额
    // 函数定义：凑出总金额amount，至少需要coinChange(coins, amount)枚硬币
    // base case: amount == 0时，需要0枚硬币;amount< 0时，不可能凑出
    // coinChange([1,2,5], 11) = 1 +  min(coinChange([1,2,5], 10), coinChange([1,2,5], 9), coinChange([1,2,5], 6))
    public int coinChange(int[] coins, int amount) {
        // base case
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subProblem = coinChange(coins, amount - coins[i]);
            if (subProblem < 0) {
                continue;
            }
            min = Math.min(min, subProblem + 1);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}