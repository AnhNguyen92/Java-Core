package javacore.algorithm.leetcode.under3100;

/**
 * 3028. Ant on the Boundary
 */
public class AntOnTheBoundary {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i : nums) {
            sum += i;
            if (sum == 0)
                count++;
        }
        return count;
    }
}
