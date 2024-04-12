package priv.xgx.数组双指针._189_轮转数组;

// 暴力求解
class Solution {
    public void rotate(int[] nums, int k) {
        int s = k % nums.length;
        System.out.println("右移" + s + "位");
        for (int i = 0; i < s; i++) {
            move(nums);
        }

    }

    public void move(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Solution().rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
    }
}