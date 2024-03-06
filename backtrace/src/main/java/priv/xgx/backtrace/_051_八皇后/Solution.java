package priv.xgx.backtrace._051_八皇后;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xgx
 */
public class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        LinkedList<String> trace = new LinkedList<>();
        backtrace(trace, board, n, 0);
        return res;
    }

    public void backtrace(LinkedList<String> trace, String[][] board, int length, int row) {
        if (trace.size() == length) {
            res.add(new ArrayList<>(trace));
            return;
        }

        for (int column = 0; column < length; column++) {
            if (!valid(board, row, column)) {
                continue;
            }
            // 做选择
            board[row][column] = "Q";
            String line = "";
            for (int i = 0; i < length; i++) {
                line += board[row][i];
            }
            trace.add(line);
            // System.out.println(trace);
            // 进入下一行放皇后
            backtrace(trace, board, length, row + 1);
            // 撤销选择
            trace.removeLast();
            board[row][column] = ".";

        }

    }

    private boolean valid(String[][] board, int row, int column) {
        for (int i = 0; i < row; i++) {
            if ('Q' == board[i][column].charAt(0)) {
                return false;
            }
        }
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if ('Q' == board[i][j].charAt(0)) {
                return false;
            }
        }
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if ('Q' == board[i][j].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
