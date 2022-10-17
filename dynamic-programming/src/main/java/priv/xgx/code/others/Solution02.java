package priv.xgx.code.others;

import java.util.Objects;

/**
 * @author xgx
 * 同样为动态规划方法
 */
public class Solution02 {

    private final static int minLength = 2;
    public static String longestPalindrome(String s) {
        if (Objects.isNull(s) || s.length() < minLength) {
            return s;
        }
        int begin = 0, maxLength = 1;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        //从最小回文长度开始遍历
        for (int L = minLength; L <= length; L++) {
            for (int i = 0; i < length; i++) {
                int j = i + L - 1;
                if (j >= length) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        //这里更短的范围计算过了，所以可以直接使用dp[i + 1][j - 1]
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] && j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        begin = i;
                    }
                }
            }
        }
        return s.substring(begin, begin + maxLength);
    }

    public static void main(String[] args) {
        String s = longestPalindrome("aacabdkacaa");
        System.out.println(s);
    }
}
