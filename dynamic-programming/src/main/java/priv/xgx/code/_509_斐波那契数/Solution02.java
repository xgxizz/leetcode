package priv.xgx.code._509_斐波那契数;

class Solution02 {
    public int fib(int n) {
        int[] demo = new int[n + 1];
        return helper(demo, n);
    }

    private int helper(int[] demo, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (demo[n] != 0) {
            return demo[n];
        }
        demo[n] = helper(demo, n - 1) + helper(demo, n - 2);
        return demo[n];
    }

}