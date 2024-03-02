package priv.xgx.数组双指针._10_两数之和;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/1 23:14
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = {2, 7, 11, 15};
        // int target = 9;
        // int[] nums = {3, 2, 4};
        // int target = 6;
        int[] nums = {3, 3};
        int target = 6;
        int[] results = new Solution().twoSum(nums, target);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
