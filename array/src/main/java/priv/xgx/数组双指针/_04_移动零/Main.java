package priv.xgx.数组双指针._04_移动零;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 23:12
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
