package priv.xgx.数组双指针._03_移除元素;

class Solution {
    // [3,2,2,3]
    // [0,1,2,2,3,0,4,2]
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}