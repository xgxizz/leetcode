package com.xgx.leetcode._290_单词规律;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        char[] pCharArray = pattern.toCharArray();
        String[] words = s.split(" ");
        if (pCharArray.length != words.length) {
            return false;
        }
        for (int i = 0; i < pCharArray.length; i++) {
            if (!map.containsKey(pCharArray[i]) && !map.containsValue(words[i])) {
                map.put(pCharArray[i], words[i]);
            }
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!words[i].equals(map.get(pCharArray[i]))) {
                return false;
            }
        }
        return true;
    }
}