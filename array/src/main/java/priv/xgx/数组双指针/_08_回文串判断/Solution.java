package priv.xgx.数组双指针._08_回文串判断;

class Solution {
    // A man, a plan, a canal: Panama
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sgood.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = sgood.length() - 1;
        while (left <= right) {
            if (sgood.charAt(left) != sgood.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}