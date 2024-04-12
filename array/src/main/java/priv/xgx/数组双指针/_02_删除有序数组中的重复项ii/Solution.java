package priv.xgx.数组双指针._02_删除有序数组中的重复项ii;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            map.put(nums[fast], map.getOrDefault(nums[fast], 0) + 1);
            if (nums[slow] == nums[fast] && map.get(nums[fast]) > 2) {
                fast++;
            } else {
                nums[++slow] = nums[fast++];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int len = new Solution().removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

}