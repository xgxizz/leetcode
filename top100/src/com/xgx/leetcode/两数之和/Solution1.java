package com.xgx.leetcode.两数之和;

/**
 * @Description: 两数之和 - 暴力枚举
 * @Author: xu.gx
 * @Date: 2023/10/17 17:11
 **/
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
