package priv.xgx.code._322_零钱兑换;

import java.util.Arrays;

/**
 * 自顶部乡下递归遍历
 */
class Solution02_01 {
    // 状态：目标金额amount
    // 选择：coins数组中列出的所有硬币面额
    // 函数定义：凑出总金额amount，至少需要coinChange(coins, amount)枚硬币
    // base case: amount == 0时，需要0枚硬币;amount< 0时，不可能凑出
    // coinChange([1,2,5], 11)
    // = 1 + min(coinChange([1,2,5], 10),min(coinChange([1,2,5], 9),min(coinChange([1,2,5], 6))

    // 备忘录
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -100);
        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo[amount] != -100) {
            return memo[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins, amount - coin);
            if (subProblem < 0) {
                continue;
            }
            min = Math.min(min, subProblem + 1);
        }
        memo[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[amount];
    }

    public static void main(String[] args) {
        // int[] coins = new int[]{1, 2, 5};
        // int amount = 11;
        // int[] coins = new int[]{2};
        // int amount = 3;
        // int[] coins = new int[]{1};
        // int amount = 1;
        // int[] coins = new int[]{1};
        // int amount = 2;
        // int[] coins = new int[]{1, 2147483647};
        // int amount = 2;
        int[] coins = new int[]{1, 2, 5};
        int amount = 100;
        int i = new Solution02_01().coinChange(coins, amount);
        System.out.println(i);
    }
}