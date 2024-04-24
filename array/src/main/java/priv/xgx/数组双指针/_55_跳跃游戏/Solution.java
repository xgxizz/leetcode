package priv.xgx.数组双指针._55_跳跃游戏;

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, nums[i] + i);
            if (maxReach >= nums.length - 1) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{2,3,1,1,4};
        // int[] nums = new int[]{3,2,1,0,4};
        // int[] nums = new int[]{2,0,0};
        int[] nums = new int[]{1, 0, 3};
        boolean b = new Solution().canJump(nums);
        System.out.println(b);
    }
}