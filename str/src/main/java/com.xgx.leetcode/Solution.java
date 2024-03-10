package com.xgx.leetcode;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i - 1 >= 0 && nums[i - 1] == nums[i]) {
                continue;
            } else {
                temp++;
                if (temp == 3) {
                    return nums[i];
                }
            }

        }

        return nums[nums.length - 1];

    }

    public static void main(String[] args) {
        int i = new Solution().thirdMax(new int[]{1, 2, 3});
        System.out.println(i);
    }
}