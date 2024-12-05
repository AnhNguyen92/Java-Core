package javacore.algorithm.leetcode.under3000;

/**
 * 2938. Separate Black and White Balls
 */
public class SeparateBlackAndWhiteBalls {
    public long minimumSteps(String s) {
        long swap = 0;
        char[] arr = s.toCharArray();
        int zero = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                zero++;
            } else {
                swap += zero;
            }
        }
        return swap;
    }
}
