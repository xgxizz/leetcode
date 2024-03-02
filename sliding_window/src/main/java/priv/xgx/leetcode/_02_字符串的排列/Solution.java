package priv.xgx.leetcode._02_字符串的排列;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        Map<Character, Integer> windowFreq = new HashMap<>();
        int matched = 0;
        while (right < s2.length()) {
            char c1 = s2.charAt(right);
            windowFreq.put(c1, windowFreq.getOrDefault(c1, 0) + 1);
            if (windowFreq.get(c1).equals(targetFreq.get(c1))) {
                matched++;
            }
            right++;
            if (right - left >= s1.length()) {
                if (matched == targetFreq.size()) {
                    return true;
                }
                char c2 = s2.charAt(left);
                if (targetFreq.containsKey(c2)) {

                    if (windowFreq.get(c2).equals(targetFreq.get(c2))) {
                        matched--;
                    }
                    windowFreq.put(c2, windowFreq.get(c2) - 1);
                }

                left++;
            }
        }
        return false;
    }
}