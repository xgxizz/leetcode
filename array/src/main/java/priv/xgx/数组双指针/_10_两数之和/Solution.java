package priv.xgx.数组双指针._10_两数之和;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // nums = [2,7,11,15], target = 9
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return (new int[]{map.get(num), i});
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}