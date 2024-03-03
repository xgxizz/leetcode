package priv.xgx.数组双指针._18_搜索旋转排序数组;

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int turn = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                turn = i;
                break;
            }
        }
        if (target >= nums[turn] && target <= nums[nums.length - 1]) {
            return binarySearch(nums, turn, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, turn - 1, target);
        }

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