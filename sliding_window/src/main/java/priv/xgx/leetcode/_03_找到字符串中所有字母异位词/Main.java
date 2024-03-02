package priv.xgx.leetcode._03_找到字符串中所有字母异位词;

import java.util.List;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/1 00:12
 **/
public class Main {
    public static void main(String[] args) {
        // String s = "cbaebabacd", p = "abc";
        String s = "abab", p = "ab";
        // String s = "baa", p = "aa";
        List<Integer> anagrams = new Solution().findAnagrams(s, p);
        System.out.println(anagrams);
    }
}
