package priv.xgx.数组双指针._19_搜索插入位置;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/3 23:57
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{1, 3, 5, 6};
        // int target = 5;
        // int[] nums = new int[]{1, 3, 5, 6};
        // int target = 2;
        // int[] nums = new int[]{1, 3, 5, 6};
        // int target = 7;
        // int[] nums = new int[]{1, 3, 5, 6};
        // int target = 0;
        int[] nums = new int[]{1, 1, 1, 3};
        int target = 2;
        int i = new Solution().searchInsert(nums, target);
        System.out.println(i);
    }
}
