package priv.xgx.数组双指针._15_加一;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length + 1];
        int temp = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            if (i == 0) {
                ans[i] = temp;
                continue;
            }
            int sum = temp + digits[i - 1];
            temp = sum / 10;
            ans[i] = sum % 10;
        }
        if (ans[0] == 0) {
            int[] newdigits = new int[digits.length];
            for (int i = 1; i < ans.length; i++) {
                newdigits[i - 1] = ans[i];
            }
            return newdigits;
        } else {
            return ans;
        }
    }
}