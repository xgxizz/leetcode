package com.xgx.leetcode._383_赎金信;

class Solution02 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] > 0) {
                count[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String ransomNote = "aaa", magazine = "aab";
        boolean b = new Solution02().canConstruct(ransomNote, magazine);
        System.out.println(b);
    }
}