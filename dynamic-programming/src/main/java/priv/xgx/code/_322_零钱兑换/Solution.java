package priv.xgx.code._322_零钱兑换;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: xu.gx
 * @Date: 2024/3/20 23:12
 **/
public class Solution {
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -10);
        return dp(memo, coins, amount);
    }

    private int dp(int[] memo, int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo[amount] != -10) return memo[amount];
        int min = 0;
        for (int coin : coins) {
            int subProblem = dp(memo, coins, amount - coin);
            if (subProblem == -1) continue;
            min = Math.min(min, 1 + subProblem);
        }
        memo[amount] = min == Integer.MAX_VALUE ? -1 : min;
        return memo[amount];
    }

}
