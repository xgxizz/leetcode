package priv.xgx.leetcode._05_存在重复元素II;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0, r = 0;
        Set<Integer> set = new HashSet<>();
        while (r - l <= k) {
            if (set.add(nums[r])) {
                r++;
            } else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{1, 0, 1, 1};
        // int k = 1;
        // int[] nums = new int[]{1, 2, 3, 1};
        // int k = 3;
        // int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        // int k = 2;
        int[] nums = new int[]{99, 99};
        int k = 2;
        System.out.println(new Solution().containsNearbyDuplicate(nums, k));
    }
}