package priv.xgx.backtrace._077_组合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k <= 0 || n < k) {
            return res;
        }
        LinkedList<Integer> trace = new LinkedList<>();
        backtrace(n, k, 1, trace);
        return res;
    }

    public void backtrace(int n, int k, int start, LinkedList<Integer> trace) {
        if (trace.size() == k) {
            res.add(new ArrayList(trace));
            return;
        }
        for (int i = start; i <= n; i++) {

            trace.add(i);
            backtrace(n, k, i + 1, trace);
            trace.removeLast();

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> combine = new Solution().combine(4, 2);
        System.out.println(combine);
    }
}