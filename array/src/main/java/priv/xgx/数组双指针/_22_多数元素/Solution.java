package priv.xgx.数组双指针._22_多数元素;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int num = -1;
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                num = entry.getKey();
            }
        }
        return num;
    }
}