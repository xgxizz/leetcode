package priv.xgx.数组双指针._21_最后一个单词的长度;

class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int len = 0;
        while (s.charAt(index) == ' ') {
            index--;
        }
        while (index > 0) {
            if (s.charAt(index) != ' ') {
                len++;
                index--;
            } else {
                break;
            }
        }
        return len;
    }
}