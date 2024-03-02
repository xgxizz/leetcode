package priv.xgx.数组双指针._12_三数之和;

import java.util.List;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/2 20:47
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        // int[] nums = new int[]{0, 1, 1};
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> lists = new Solution().threeSum(nums);
        System.out.println(lists);
    }
}
