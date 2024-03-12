package priv.xgx.数组双指针._349_两个数组的交集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> res = new ArrayList<>();
        while (p1 != nums1.length && p2 != nums2.length) {
            if (nums1[p1] > nums2[p2]) {
                p2++;
                while (p2 < nums2.length && nums2[p2] == nums2[p2 - 1]) {
                    p2++;
                }
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
                while (p1 < nums1.length && nums1[p1] == nums1[p1 - 1]) {
                    p1++;
                }
            } else {
                res.add(nums1[p1]);
                p1++;
                p2++;
                while (p2 < nums2.length && nums2[p2] == nums2[p2 - 1]) {
                    p2++;
                }
                while (p1 < nums1.length && nums1[p1] == nums1[p1 - 1]) {
                    p1++;
                }
            }
        }

        if (res.size() > 0) {
            int[] result = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                result[i] = res.get(i);
            }
            return result;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        // int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = new int[]{2, 2};
        // int[] nums1 = new int[]{4, 9, 5}, nums2 = new int[]{9, 4, 9, 8, 4};
        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = new int[]{1, 1};
        int[] intersection = new Solution().intersection(nums1, nums2);
        for (int num : intersection) {
            System.out.println(num);
        }
    }
}