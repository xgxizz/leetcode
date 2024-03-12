package com.xgx.leetcode._119_杨辉三角II;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1, rowIndex);
    }

    public List<Integer> generate(int numRows, int rowIndex) {
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
        List<Integer> line = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i != rowIndex) {
                continue;
            }

            for (int j = 0; j <= i; j++) {
                line.add(nums[i][j]);
            }
        }
        return line;
    }
}