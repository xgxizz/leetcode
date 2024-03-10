package com.xgx.leetcode._012_整数转罗马数字;

class Solution {
    public String intToRoman(int num) {
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreads = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] + hundreads[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10];
    }
}