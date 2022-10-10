package priv.xgx.code.最长回文子串;

import java.util.Objects;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        //babad
        if (Objects.isNull(s) || s.length() < 1) {
            return s;
        }
        int length = s.length();
        int[][] dp = new int[length][length];
        char[] chars = s.toCharArray();
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        int start = 0;
        int end = 0;
        int maxLength = 0;

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                if (chars[i] == chars[j]) {
                    //if (i == j || j - 1 == 1) {
                    //以下判断条件和上边注释的意思一致
                    if (j - i <= 1) {
                        dp[i][j] = 1;
                        if (j - i > maxLength) {
                            start = i;
                            end = j;
                            maxLength = j - i;
                        }
                    } else if (dp[i + 1][j - 1] == 1){
                        dp[i][j] = 1;
                        if (j - i > maxLength) {
                            start = i;
                            end = j;
                            maxLength = j - i;
                        }
                    }
                }
            }
        }
        //printDp(dp);
        return s.substring(start, end + 1);
    }

    public static void printDp(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = longestPalindrome("aacabdkacaa");
        System.out.println(s);
    }

    /**
     * 思考：为什么循环体是从最后开始？
     * 因为dp[i + 1][j - 1] == 1 这一步需要用到dp[i + 1][j - 1]。
     * 如果i = 0开始，那么dp[i + 1][?]还没有计算
     */
}
