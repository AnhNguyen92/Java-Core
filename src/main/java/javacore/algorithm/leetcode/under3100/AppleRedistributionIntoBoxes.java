package javacore.algorithm.leetcode.under3100;

import java.util.Arrays;

/**
 * 3074. Apple Redistribution into Boxes
 */
public class AppleRedistributionIntoBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }
        for (int j = capacity.length - 1; j >= 0; j--) {
            sum -= capacity[j];
            if (sum <= 0) {
                return (capacity.length - j);
            }
        }
        return capacity.length;
    }
}
