package priv.xgx.数组双指针._14_四数之和;

import java.util.List;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/2 23:16
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        // int target = 0;
        // int[] nums = new int[]{2, 2, 2, 2, 2};
        // int target = 8;
        // int[] nums = new int[]{-2, -1, -1, 1, 1, 2, 2};
        // int target = 0;
        int[] nums = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        List<List<Integer>> lists = new Solution().fourSum(nums, target);
        System.out.println(lists);
        int sum = 1000000000 * 4;
        System.out.println(sum);

    }
}
