package priv.xgx.backtrace._040_组合总和II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> trace = new LinkedList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrace(candidates, target, 0);
        return res;
    }

    public void backtrace(int[] candidates, int target, int start) {
        if (sum == target) {
            res.add(new LinkedList(trace));
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            trace.add(candidates[i]);
            sum += candidates[i];
            backtrace(candidates, target, i + 1);
            trace.removeLast();
            sum -= candidates[i];
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(lists);
    }
}