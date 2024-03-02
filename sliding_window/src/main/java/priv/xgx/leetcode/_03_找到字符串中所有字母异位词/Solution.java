package priv.xgx.leetcode._03_找到字符串中所有字母异位词;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> target = new HashMap<>();
        for (char c : p.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int matched = 0;
        while (right < s.length()) {
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1, 0) + 1);
            if (window.get(c1).equals(target.get(c1))) {
                matched++;
            }
            right++;
            while (right - left >= p.length()) {
                if (matched == target.size()) {
                    result.add(left);
                }
                char c2 = s.charAt(left);
                if (target.containsKey(c2)) {
                    if (window.get(c2).equals(target.get(c2))) {
                        matched--;
                    }
                    window.put(c2, window.get(c2) - 1);
                }

                left++;
            }
        }

        return result;
    }
}