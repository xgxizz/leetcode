package priv.xgx.数组双指针._238_除自身以外数组的乘积;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct = nums[i] * rightProduct;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] answers = new Solution().productExceptSelf(nums);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

}