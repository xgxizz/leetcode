package priv.xgx.数组双指针._04_移动零;

class Solution {
    // [0,1,0,3,12]
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}