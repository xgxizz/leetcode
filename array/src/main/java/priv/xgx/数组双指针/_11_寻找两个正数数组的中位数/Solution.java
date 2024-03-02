package priv.xgx.数组双指针._11_寻找两个正数数组的中位数;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] nums = new int[len];
        int i = 0, j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[index++] = nums1[i++];
            } else {
                nums[index++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            nums[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[index++] = nums2[j++];
        }
        int mid = (len - 1) / 2;
        if (len % 2 == 0) {
            return (double) (nums[mid] + nums[mid + 1]) / 2;
        } else {
            return nums[mid];
        }
    }
}