package com.xgx.leetcode._383_赎金信;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = magazine.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        chars = ransomNote.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                int newVal = map.get(c) - 1;
                map.put(c, newVal);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        boolean b = new Solution().canConstruct(ransomNote, magazine);
        System.out.println(b);
    }
}