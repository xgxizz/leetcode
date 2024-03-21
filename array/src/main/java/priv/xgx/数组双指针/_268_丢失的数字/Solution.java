package priv.xgx.数组双指针._268_丢失的数字;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max = Math.max(nums.length, nums[nums.length - 1]);

        for (int i = 0; i < max && i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return max;
    }
}