package com.xgx.leetcode._118_杨辉三角;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] nums = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            nums[i][i] = 1;
            nums[i][0] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                line.add(nums[i][j]);
            }
            res.add(new ArrayList(line));
        }
        return res;
    }
}