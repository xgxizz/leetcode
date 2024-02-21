package priv.xgx.backtrace.括号生成;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }


    // current 是一个字符串，而字符串是不可变的，因此不能像 LinkedList 那样通过 removeLast() 直接修改。
    // 相反，原来的方式通过每次创建新的字符串 current + "(" 和 current + ")" 来模拟回退和尝试其他选择。
    // 在Java中，字符串是不可变的（immutable），每次对字符串进行拼接或修改都会创建一个新的字符串。
    // 因此，current + "(" 和 current + ")" 实际上创建了新的字符串对象，而不是直接修改 current 对象。
    private static void backtrack(List<String> result, String current, int left, int right, int n) {
        // 终止条件
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        // 添加左括号
        if (left < n) {
            backtrack(result, current + "(", left + 1, right, n);
        }
        // 添加右括号
        if (right < left) {
            backtrack(result, current + ")", left, right + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}
