package priv.xgx.数组双指针._22_多数元素;

class Solution02 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{3, 2, 3};
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        int majorityElement = new Solution02().majorityElement(nums);
        System.out.println(majorityElement);
    }
}