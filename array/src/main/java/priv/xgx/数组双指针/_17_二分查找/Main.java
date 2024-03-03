package priv.xgx.数组双指针._17_二分查找;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/3 23:28
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int search = new Solution02().search(nums, target);
        System.out.println(search);
    }
}
