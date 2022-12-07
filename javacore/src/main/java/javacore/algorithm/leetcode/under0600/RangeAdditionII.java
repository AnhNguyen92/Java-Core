package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 598. Range Addition II
 */
public class RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int r = ops[0][0];
        int c = ops[0][1];
        for (int i = 1; i < ops.length; i++) {
            if (r > ops[i][0]) {
                r = ops[i][0];
            }
            if (c > ops[i][1]) {
                c = ops[i][1];
            }
        }
        
        return r * c;
    }
}
