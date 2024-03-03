package priv.xgx.数组双指针._16_合并两个有序数组;

class Solution {
    // 1, 2, 3, 0, 0, 0
    // 2, 5, 6
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[index--] = nums2[j--];
            } else {
                nums1[index--] = nums1[i--];
            }
        }
        if (i >= 0) {
            for (int k = i; k >= 0; k--) {
                nums1[index--] = nums1[k];
            }
        }
        if (j >= 0) {
            for (int k = j; k >= 0; k--) {
                nums1[index--] = nums2[k];
            }
        }
    }
}