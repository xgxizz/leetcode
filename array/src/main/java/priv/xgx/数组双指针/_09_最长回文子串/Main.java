package priv.xgx.数组双指针._09_最长回文子串;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/22 00:20
 **/
public class Main {
    public static void main(String[] args) {
        // String s = "babad";
        String s = "abcdcba";
        // String s = "cbbd";
        String s1 = new Solution().longestPalindrome(s);
        System.out.println(s1);
    }
}
