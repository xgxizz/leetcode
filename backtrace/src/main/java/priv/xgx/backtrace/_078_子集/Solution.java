package priv.xgx.backtrace._078_子集;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> trace = new LinkedList<>();
        backtrace(nums, trace, 0);
        return res;
    }

    private void backtrace(int[] nums, LinkedList<Integer> trace, int row) {
        res.add(new LinkedList<>(trace));
        for (int i = row; i < nums.length; i++) {
            trace.addLast(nums[i]);
            backtrace(nums, trace, i + 1);
            trace.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> subsets = new Solution().subsets(nums);
        System.out.println(subsets);
    }
}