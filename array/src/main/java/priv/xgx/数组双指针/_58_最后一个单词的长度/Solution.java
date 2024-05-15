package priv.xgx.数组双指针._58_最后一个单词的长度;

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                length++;
            } else {
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int i = new Solution().lengthOfLastWord(s);
        System.out.println(i);
    }
}