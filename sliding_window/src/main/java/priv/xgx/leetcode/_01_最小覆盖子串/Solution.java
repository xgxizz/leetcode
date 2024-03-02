package priv.xgx.leetcode._01_最小覆盖子串;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        if (t.length() > s.length()) {
            return "";
        }
        int left = 0, right = 0;
        int matched = 0, start = 0, len = Integer.MAX_VALUE;
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c).equals(need.get(c))) {
                matched++;
            }
            right++;
            while (matched == need.size()) {

                if (right - left < len) {
                    len = right - left;
                    start = left;
                }
                char ch = s.charAt(left);
                if (need.containsKey(ch)) {
                    window.put(ch, window.get(ch) - 1);
                    if (window.get(ch) < need.get(ch)) {
                        matched--;
                    }
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}