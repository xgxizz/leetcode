package priv.xgx.backtrace.全排列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xgx
 */
public class Solution01 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        // 使用LinkedList的目的是为了使用removeLast()方法
        LinkedList<Integer> track = new LinkedList<>();
        backtrace(nums, track);
        return res;
    }

    void backtrace(int[] nums, LinkedList<Integer> trace) {
        if (trace.size() == nums.length) {
            res.add(new ArrayList<>(trace));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (trace.contains(nums[i])) {
                continue;
            }
            trace.add(nums[i]);
            backtrace(nums, trace);
            trace.removeLast();
        }
    }
}