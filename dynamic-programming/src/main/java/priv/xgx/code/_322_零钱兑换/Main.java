package priv.xgx.code._322_零钱兑换;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/12 23:45
 **/
public class Main {
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
        int i = new Solution02().coinChange(coins, amount);
        System.out.println(i);
    }
}
