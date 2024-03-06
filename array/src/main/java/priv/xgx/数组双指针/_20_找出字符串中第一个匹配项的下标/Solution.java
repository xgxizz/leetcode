package priv.xgx.数组双指针._20_找出字符串中第一个匹配项的下标;

class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (haystack.length() < len) {
            return -1;
        }
        for (int i = 0; i + len <= haystack.length(); i++) {
            char c = haystack.charAt(i);
            String part = haystack.substring(i, i + len);
            if (c == needle.charAt(0) && part.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}