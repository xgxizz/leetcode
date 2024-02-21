package priv.xgx.数组双指针._05_二分查找;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 23:25
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int search = new Solution().search(nums, 2);
        System.out.println(search);
    }
}
