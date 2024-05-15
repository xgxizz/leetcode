package priv.xgx.数组双指针._134_加油站;

class Solution {
    // 暴力穷举
    /*public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            int rest = 0;
            for (int j = i; j < i + n; j++) {
                int index = j % n;
                rest += gas[index] - cost[index];
                if (rest < 0) {
                    break;
                }
            }
            if (rest >= 0) {
                return i;
            }
        }
        return -1;
    }*/
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int curr = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            curr += gas[i] - cost[i];

            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }

        return total >= 0 ? start : -1;
    }


    public static void main(String[] args) {
        // int[] gas = new int[]{1,2,3,4,5};
        // int[] cost = new int[]{3,4,5,1,2};
        // int[] gas = new int[]{2,3,4};
        // int[] cost = new int[]{3,4,3};
        // int[] gas = new  int[]{4,5,2,6,5,3};
        // int[] cost = new int[]{3,2,7,3,2,9};

        int[] gas = new int[]{5,1,2,3,4};
        int[] cost = new int[]{4,4,1,5,1};
        int i = new Solution().canCompleteCircuit(gas, cost);
        System.out.println(i);
    }
}