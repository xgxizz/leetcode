package priv.xgx.leetcode._02_字符串的排列;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/29 22:56
 **/
public class Main {
    public static void main(String[] args) {
        // String s1 = "ab", s2 = "eidbaooo";
        // String s1 = "ab", s2 = "eidboaoo";
        // String s1 = "hello", s2 = "ooolleoooleh";
        String s1 = "ab", s2 = "aob";

        boolean b = new Solution().checkInclusion(s1, s2);
        System.out.println(b);
    }
}
