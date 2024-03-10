package priv.xgx.backtrace._47_全排列II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> trace = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrace(nums, used);
        return res;
    }

    public void backtrace(int[] nums, boolean[] used) {
        if (trace.size() == nums.length) {
            res.add(new LinkedList(trace));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            trace.add(nums[i]);
            used[i] = true;
            backtrace(nums, used);
            trace.removeLast();
            used[i] = false;

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().permuteUnique(new int[]{1, 1, 2});
        System.out.println(lists);
    }
}