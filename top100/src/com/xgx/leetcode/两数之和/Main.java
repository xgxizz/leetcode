package com.xgx.leetcode.两数之和;

/**
 * @Description: 验证主函数
 * @Author: xu.gx
 * @Date: 2023/10/17 17:26
 **/
public class Main {
    public static void main(String[] args) {
        // int[] arr = new int[]{2, 7, 11, 15};
        // int target = 9;
        // int[] arr = new int[]{3, 2, 4};
        // int target = 6;
        int[] arr = new int[]{3, 3};
        int target = 6;
        int[] result = new Solution2().twoSum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
