package priv.xgx.数组双指针._14_最长公共前缀;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int length = strs[i].length();
            if (length == 0) {
                return "";
            }
            minLen = Math.min(minLen, length);
        }
        int index = 0;
        char pre = strs[0].charAt(0);
        while (index < minLen) {
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                if (index == str.length() || str.charAt(index) != pre) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
            if (index < minLen) {
                pre = strs[0].charAt(index);
            }
        }
        return strs[0].substring(0, index);
    }

    public static void main(String[] args) {
        // String[] strs = new String[]{"flower", "flow", "flight"};
        // String[] strs = new String[]{"dog", "racecar", "car"};
        String[] strs = new String[]{"a"};
        String s = new Solution().longestCommonPrefix(strs);
        System.out.println(s);
    }
}