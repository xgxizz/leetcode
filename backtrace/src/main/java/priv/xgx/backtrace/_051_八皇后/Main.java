package priv.xgx.backtrace._051_八皇后;

import java.util.List;

/**
 * @Description: TODO
 * @Author: xu.gx
 * @Date: 2024/1/16 23:08
 **/
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.solveNQueens(4);
        System.out.println(lists);
    }
}
