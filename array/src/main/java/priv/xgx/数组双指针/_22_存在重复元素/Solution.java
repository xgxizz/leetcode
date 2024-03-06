package priv.xgx.数组双指针._22_存在重复元素;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int i = 0;
        // while(i < nums.length && i + 1 < nums.length) {
        //     if(nums[i] == nums[i+1]) {
        //         return true;
        //     }
        //     i++;
        // }
        // return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}