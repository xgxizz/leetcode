package com.xgx.leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<String> res = new LinkedList<>();
    StringBuilder trace = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        int left = 0, right = 0;
        backtrace(n, left, right);
        return res;
    }

    void backtrace(int n, int left, int right) {
        if (right == n) {
            res.add(trace.toString());
            return;
        }
        if (left > right) {
            trace.append(")");
            backtrace(n, left, right + 1);
            trace.deleteCharAt(trace.length() - 1);
        }
        if (left < n) {
            trace.append("(");
            backtrace(n, left + 1, right);
            trace.deleteCharAt(trace.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new Solution().generateParenthesis(3);
        System.out.println(strings);
    }
}