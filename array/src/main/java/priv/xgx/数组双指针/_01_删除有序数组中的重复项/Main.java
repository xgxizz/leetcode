package priv.xgx.数组双指针._01_删除有序数组中的重复项;

/**
 * @Description: 测试
 * @Author: xu.gx
 * @Date: 2024/2/21 22:17
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        int i = solution.removeDuplicates(nums);
        System.out.println(i);
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + ",");
        }
    }
}
