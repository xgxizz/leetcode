package com.xgx.leetcode._242_有效的字母异位词;

class Solution {

    /**
     * 示例 1:
     * <p>
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: s = "rat", t = "car"
     * 输出: false
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (count[c - 'a'] <= 0) {
                return false;
            } else {
                count[c - 'a']--;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "rat", t = "car";
        System.out.println(solution.isAnagram(s, t));
    }
}