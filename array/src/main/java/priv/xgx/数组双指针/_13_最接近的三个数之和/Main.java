package priv.xgx.数组双指针._13_最接近的三个数之和;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/2 21:23
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 0};
        int target = -100;
        int i = new Solution().threeSumClosest(nums, target);
        System.out.println(i);
    }
}
