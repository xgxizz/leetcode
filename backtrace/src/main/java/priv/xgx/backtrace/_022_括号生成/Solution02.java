package priv.xgx.backtrace._022_括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(n, "", 0, 0);
        return result;
    }

    void backtrack(int n, String track, int left, int right) {
        if (track.length() == 2 * n) {
            result.add(track);
            return;
        }
        if (left < n) {
            backtrack(n, track + "(", left + 1, right);
        }
        if (right < left) {
            backtrack(n, track + ")", left, right + 1);
        }
    }

    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        int n = 3;
        List<String> result = solution.generateParenthesis(n);
        System.out.println(result);
    }
}
