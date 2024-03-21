package priv.xgx.code._509_斐波那契数;

class Solution04 {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

}