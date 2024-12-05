package javacore.algorithm.leetcode.under3300;

/**
 * 3200. Maximum Height of a Triangle
 */
public class MaximumHeightOfATriangle {
    public int maxHeightOfTriangle(int red, int blue) {
        int min = Math.min(red, blue);
        int max = Math.max(red, blue);
        int odd = 0;
        int even = 0;
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (i % 2 == 1) {
                odd += i;
            } else {
                even += i;
            }
            if ((odd <= min && even <= max) || (even <= min && odd <= max)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
