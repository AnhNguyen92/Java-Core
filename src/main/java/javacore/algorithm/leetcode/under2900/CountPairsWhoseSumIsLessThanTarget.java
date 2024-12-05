package javacore.algorithm.leetcode.under2900;

import java.util.Collections;
import java.util.List;

/**
 * 2824. Count Pairs Whose Sum is Less than Target
 */
public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            int a = nums.get(i);
            for (int j = 0; j < i; j++) {
                if (nums.get(j) < target - a) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
