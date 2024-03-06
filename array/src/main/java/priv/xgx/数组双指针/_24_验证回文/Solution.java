package priv.xgx.数组双指针._24_验证回文;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        char[] arr = str.toString().toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l++] != arr[r--]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        boolean palindrome = new Solution().isPalindrome(s);
        System.out.println(palindrome);
    }
}