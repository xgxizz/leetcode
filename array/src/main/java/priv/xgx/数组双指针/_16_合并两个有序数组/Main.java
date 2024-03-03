package priv.xgx.数组双指针._16_合并两个有序数组;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/3 00:54
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        // int[] nums1 = new int[]{0};
        // int m = 0;
        // int[] nums2 = new int[]{1};
        // int n = 1;
        new Solution().merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
