package priv.xgx.数组双指针._151_反转字符串中的单词;

class Solution {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            reversed.append(split[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(new Solution().reverseWords(s));
    }
}