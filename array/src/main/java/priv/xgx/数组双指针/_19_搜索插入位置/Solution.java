package priv.xgx.数组双指针._19_搜索插入位置;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = binarySearch(nums, target, 0, nums.length - 1);
        return i == -1 ? 0 : i;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right);
        } else {
            return binarySearch(nums, target, left, mid - 1);
        }
    }

}