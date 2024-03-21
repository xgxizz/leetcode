package priv.xgx.code._509_斐波那契数;

class Solution03 {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i + 1];
        }
        return dp[n];
    }

}