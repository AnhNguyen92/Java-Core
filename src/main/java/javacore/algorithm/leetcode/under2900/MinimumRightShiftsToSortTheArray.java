package javacore.algorithm.leetcode.under2900;

import java.util.List;

/**
 * 2855. Minimum Right Shifts to Sort the Array
 */
public class MinimumRightShiftsToSortTheArray {
    public int minimumRightShifts(List<Integer> nums) {
        int count = 0;
        int min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > nums.get( (i + 1) % nums.size() )) {
                count++;
            }
            if (nums.get(min) > nums.get(i)) {
                min = i;
            }
        }
        if (count > 1) {
            return -1;
        }
        if (count == 0 || min == 0) {
            return 0;
        }
        return nums.size() - min;
    }
}
