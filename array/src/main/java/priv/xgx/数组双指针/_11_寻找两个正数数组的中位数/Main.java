package priv.xgx.数组双指针._11_寻找两个正数数组的中位数;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/1 23:40
 **/
public class Main {
    public static void main(String[] args) {
        // int[] nums1 = new int[]{1};
        // int[] nums2 = new int[]{};
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        // int[] nums1 = new int[]{1, 2};
        // int[] nums2 = new int[]{3, 4};
        double mid = new Solution().findMedianSortedArrays(nums1, nums2);
        System.out.println(mid);
    }
}
