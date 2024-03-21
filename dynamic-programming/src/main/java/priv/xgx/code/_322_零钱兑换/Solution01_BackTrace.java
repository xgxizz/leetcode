package priv.xgx.code._322_零钱兑换;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 回溯法求解零钱兑换问题
 */
class Solution01_BackTrace {

    LinkedList<Integer> trace = new LinkedList<>();
    int min = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        backtrace(coins, amount);
        return min;
    }

    private void backtrace(int[] coins, int amount) {
        int sum = 0;
        for (int i = 0; i < trace.size(); i++) {
            sum += trace.get(i);
        }
        if (sum == amount) {
            min = Math.min(min, trace.size());
            return;
        }
        if (sum > amount || sum < 0 || trace.size() > min) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            trace.add(coins[i]);
            backtrace(coins, amount);
            trace.removeLast();
        }
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
        int i = new Solution01_BackTrace().coinChange(coins, amount);
        System.out.println(i);
    }
}