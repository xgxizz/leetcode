package priv.xgx.数组双指针._08_回文串判断;

/**
 * @Description: test
 * @Author: xu.gx
 * @Date: 2024/2/21 23:58
 **/
public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = new Solution().isPalindrome(s);
        System.out.println(palindrome);
    }
}
