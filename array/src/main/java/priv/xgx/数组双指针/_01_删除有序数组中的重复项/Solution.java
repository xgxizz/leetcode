package priv.xgx.数组双指针._01_删除有序数组中的重复项;

public class Solution {
    //[0,0,1,1,1,2,2,3,3,4]
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 1;
        while (slow < nums.length && fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}