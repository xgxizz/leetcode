package priv.xgx.code._509_斐波那契数;

class Solution01 {
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}