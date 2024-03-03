package priv.xgx.数组双指针._18_搜索旋转排序数组;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/3 23:47
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        // int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        // int target = 3;
        int[] nums = new int[]{1};
        int target = 0;
        int search = new Solution().search(nums, target);
        System.out.println(search);
    }
}
