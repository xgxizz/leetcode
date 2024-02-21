package priv.xgx.backtrace.括号生成;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: List方式实现
 * @Author: xu.gx
 * @Date: 2024/1/17 15:24
 **/
public class Solution01 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        LinkedList<Character> trace = new LinkedList<>();
        backtrace(trace, n, 0, 0);
        return result;
    }

    public void backtrace(LinkedList<Character> trace, int n, int left, int right) {
        if (trace.size() == 2 * n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < trace.size(); i++) {
                sb.append(trace.get(i));
            }
            result.add(sb.toString());
            return;
        }

        // 做选择
        // 添加左括号
        if (left < n) {
            trace.add('(');
            backtrace(trace, n, left + 1, right);
            trace.removeLast();
        }
        // 添加右括号
        if (right < left) {
            trace.add(')');
            backtrace(trace, n, left, right + 1);
            trace.removeLast();
        }
    }

    public static void main(String[] args) {
        List<String> strings = new Solution01().generateParenthesis(3);
        System.out.println(strings);
    }
}
