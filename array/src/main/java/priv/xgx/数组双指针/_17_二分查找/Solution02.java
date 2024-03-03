package priv.xgx.数组双指针._17_二分查找;

class Solution02 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target && left < right) {
            return binarySearch(nums, mid + 1, right, target);
        } else if (nums[mid] > target && left < right) {
            return binarySearch(nums, left, mid - 1, target);
        } else {
            return -1;
        }
    }
}