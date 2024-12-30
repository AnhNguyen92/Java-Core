package javacore.algorithm.leetcode.under1200;

/**
 * 1131. Maximum of Absolute Value Expression
 */
public class MaximumOfAbsoluteValueExpression {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int ans = 0;
        int minf1 = 1000000, maxf1 = -1000000;
        int minf2 = 1000000, maxf2 = -1000000;
        int minf3 = 1000000, maxf3 = -1000000;
        int minf4 = 1000000, maxf4 = -1000000;
        int a, b, c, d;
        for (int x = 0; x < arr1.length; x++) {
            a = arr1[x] + arr2[x] + x;
            b = arr1[x] - arr2[x] + x;
            c = -arr1[x] + arr2[x] + x;
            d = -arr1[x] - arr2[x] + x;
            minf1 = Math.min(minf1, a);
            maxf1 = Math.max(maxf1, a);
            minf2 = Math.min(minf2, b);
            maxf2 = Math.max(maxf2, b);
            maxf3 = Math.max(maxf3, c);
            minf3 = Math.min(minf3, c);
            minf4 = Math.min(minf4, d);
            maxf4 = Math.max(maxf4, d);
        }
        ans = Math.max(ans, maxf1 - minf1);
        ans = Math.max(ans, maxf2 - minf2);
        ans = Math.max(ans, maxf3 - minf3);
        ans = Math.max(ans, maxf4 - minf4);

        return ans;
    }
}
