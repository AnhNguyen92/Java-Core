package javacore.algorithm.leetcode.under2600;

/**
 * 2579. Count Total Number of Colored Cells
 */
public class CountTotalNumberOfColoredCells {
        public long coloredCells(int n) {
            return 2L * n * (n - 1) + 1L;
        }
}
