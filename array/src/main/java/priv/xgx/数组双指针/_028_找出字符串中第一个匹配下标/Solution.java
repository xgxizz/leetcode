package priv.xgx.数组双指针._028_找出字符串中第一个匹配下标;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int i = 0, j = needle.length();
        while (j <= haystack.length()) {
            String substring = haystack.substring(i, j);
            if (substring.equals(needle)) {
                return i;
            } else {
                i++;
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        int i = new Solution().strStr(haystack, needle);
        System.out.println(i);
    }
}