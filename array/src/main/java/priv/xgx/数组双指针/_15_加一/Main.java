package priv.xgx.数组双指针._15_加一;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/3 00:34
 **/
public class Main {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};
        int[] ans = new Solution().plusOne(digits);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "");
        }
    }
}
