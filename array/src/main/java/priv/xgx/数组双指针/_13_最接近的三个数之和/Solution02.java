package priv.xgx.数组双指针._13_最接近的三个数之和;

import java.util.Arrays;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/2 22:10
 **/
public class Solution02 {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                int diff = sum - target;
                if (diff < 0) {
                    diff = 0 - diff;
                }
                if (diff == 0) {
                    return sum;
                }
                if (diff < min) {
                    min = diff;
                    ans = sum;
                }
                if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return ans;
    }

}
