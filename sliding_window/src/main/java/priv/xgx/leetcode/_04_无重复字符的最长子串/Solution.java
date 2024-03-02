package priv.xgx.leetcode._04_无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;
        while (right < s.length()) {
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1, 0) + 1);

            while (window.get(c1) > 1) {
                char c2 = s.charAt(left);
                maxLen = Math.max(maxLen, right - left);
                left++;
                window.put(c2, window.get(c2) - 1);

            }
            right++;
        }
        return Math.max(maxLen, right - left);
    }
}