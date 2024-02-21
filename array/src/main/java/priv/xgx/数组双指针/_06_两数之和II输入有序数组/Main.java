package priv.xgx.数组双指针._06_两数之和II输入有序数组;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 23:37
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{1, 2, 4, 6, 10};
        // int target = 8;
        // int[] nums = new int[]{2, 3, 4};
        // int target = 6;
        int[] nums = new int[]{-1, 0};
        int target = -1;
        Solution solution = new Solution();
        int[] indexes = solution.twoSum(nums, target);
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
    }
}
