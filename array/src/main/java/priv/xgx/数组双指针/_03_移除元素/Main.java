package priv.xgx.数组双指针._03_移除元素;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 22:50
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int i = new Solution().removeElement(nums, 2);
        System.out.println("new length:" + i);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
    }
}
