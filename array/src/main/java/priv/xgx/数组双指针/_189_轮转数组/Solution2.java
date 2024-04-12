package priv.xgx.数组双指针._189_轮转数组;


class Solution2 {
    public void rotate(int[] nums, int k) {
        int s = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, s - 1);
        reverse(nums, s, nums.length - 1);

    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Solution2().rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "");
        }
    }
}