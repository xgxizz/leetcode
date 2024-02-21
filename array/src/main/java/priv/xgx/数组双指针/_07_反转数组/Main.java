package priv.xgx.数组双指针._07_反转数组;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 23:46
 **/
public class Main {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        new Solution().reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
