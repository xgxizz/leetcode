package com.xgx.leetcode._205_同构字符串;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int n = sarr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(sarr[i]) && !map.get(sarr[i]).equals(tarr[i])) {
                return false;
            } else {
                map.put(sarr[i], tarr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map2.containsKey(tarr[i]) && !map2.get(tarr[i]).equals(sarr[i])) {
                return false;
            } else {
                map2.put(tarr[i], sarr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo", t = "bar";
        System.out.println(new Solution().isIsomorphic(s, t));
    }
}