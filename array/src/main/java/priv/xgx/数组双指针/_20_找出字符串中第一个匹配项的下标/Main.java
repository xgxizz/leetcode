package priv.xgx.数组双指针._20_找出字符串中第一个匹配项的下标;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/3/4 21:23
 **/
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello", needle = "ll";
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
    }
}
