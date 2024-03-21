package priv.xgx.code._322_零钱兑换;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: xu.gx
 * @Date: 2024/3/21 22:08
 **/
public class Solution03 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        // int[] coins = new int[]{2};
        // int amount = 3;
        // int[] coins = new int[]{1};
        // int amount = 1;
        // int[] coins = new int[]{1};
        // int amount = 2;
        // int[] coins = new int[]{1, 2147483647};
        // int amount = 2;
        // int[] coins = new int[]{1, 2, 5};
        // int amount = 100;
        int i = new Solution02_01().coinChange(coins, amount);
        System.out.println(i);
    }
}
