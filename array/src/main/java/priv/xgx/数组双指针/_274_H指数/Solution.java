package priv.xgx.数组双指针._274_H指数;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] >= h) {
                h++;
            } else {
                break;
            }
        }
        return h - 1;
    }
}