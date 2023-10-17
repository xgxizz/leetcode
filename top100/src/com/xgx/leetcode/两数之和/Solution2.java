package com.xgx.leetcode.两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 两数之和 - 哈希表
 * @Author: xu.gx
 * @Date: 2023/10/17 17:11
 **/
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i > 0) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
