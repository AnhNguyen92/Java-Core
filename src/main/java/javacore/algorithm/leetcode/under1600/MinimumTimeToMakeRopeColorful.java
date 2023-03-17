package javacore.algorithm.leetcode.under1600;

import java.util.Arrays;

/*
 * LeetCode 1578. Minimum Time to Make Rope Colorful
 */
public class MinimumTimeToMakeRopeColorful {
    public static int minCost(String colors, int[] neededTime) {
        int count = 0;
        int j;
        for (int i = 0; i < neededTime.length - 1; i++) {
            j = i;
            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                j++;
            }
            Arrays.sort(neededTime, i, j);
            if (j - i > 1)
                for (int k = i; k < j - 1; k++) {
                    count += neededTime[k];
                }
            i = j - 1;
        }
        return count;
    }

}
