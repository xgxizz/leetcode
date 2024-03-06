package priv.xgx.数组双指针._22_多数元素;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/4 22:28
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 4};
        int i = new Solution().majorityElement(nums);
        System.out.println(i);
    }
}
