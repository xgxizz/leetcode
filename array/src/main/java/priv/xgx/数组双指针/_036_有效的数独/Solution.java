package priv.xgx.数组双指针._036_有效的数独;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        return effectiveLine(board) && effectiveColumn(board) && effectiveCell(board);
    }

    public static boolean effectiveLine(char[][] board) {

        for (int r = 0; r < board.length; r++) {
            Set<Character> line = new HashSet<>();
            for (int c = 0; c < board.length; c++) {
                if (board[r][c] != '.' && !line.add(board[r][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean effectiveColumn(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> column = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean effectiveCell(char[][] board) {
        Set<Character> cell = new HashSet<>();
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = i; j < board.length; j = j + 3) {
                if (board[i][j] != '.' && !cell.add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // char[][] board = {
        //         {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        //         {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        //         {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        //         {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        //         {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        //         {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        //         {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        //         {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        //         {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        // };
        char[][] board = {
                {'.', '.', '.', '3', '.', '.', '.', '1', '.'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '8', '2', '7', '.'},
                {'1', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'2', '.', '.', '.', '8', '.', '.', '.', '7'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(effectiveLine(board));
        System.out.println(effectiveColumn(board));
        System.out.println(effectiveCell(board));
        System.out.println(effectiveLine(board) && effectiveColumn(board) && effectiveCell(board));
        System.out.println('9' - '1');
    }
}