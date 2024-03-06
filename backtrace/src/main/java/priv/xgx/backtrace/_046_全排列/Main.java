package priv.xgx.backtrace._046_全排列;

import java.util.List;

/**
 * @Description: 测试类
 * @Author: xu.gx
 * @Date: 2024/1/10 14:12
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> permute = new Solution01().permute(nums);
        for (List<Integer> route : permute) {
            System.out.println(route);
        }
        System.out.println("-----------------");
        List<List<Integer>> permute2 = new Solution02().permute(nums);
        for (List<Integer> route : permute2) {
            System.out.println(route);
        }
    }
}
