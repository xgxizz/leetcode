package priv.xgx.数组双指针._006_Z字形变换;

class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[][] res = new char[numRows][s.length()];
        int row = 0, column = 0;
        int index = 0;
        boolean direct = true;// 0向下，1向上
        while (index < s.length()) {
            if (direct) {
                res[row++][column] = s.charAt(index++);
                if (row == numRows - 1) {
                    direct = false;
                    // row -= 1;
                }
            } else {
                res[row--][column++] = s.charAt(index++);
                if (row == 0) {
                    direct = true;
                    // row += 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < res[i].length; j++) {
                Character c = res[i][j];
                if (res[i][j] != '\0') {
                    sb.append(c);
                }
                // System.out.print(c + " ");

            }
            // System.out.println();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String paypalishiring = new Solution().convert("PAYPALISHIRING", 3);
        // String paypalishiring = new Solution().convert("PAYPALISHIRING", 4);
        // String paypalishiring = new Solution().convert("PAYPALISHIRING", 2);
        // String paypalishiring = new Solution().convert("AB", 1);
        System.out.println(paypalishiring);
    }

}