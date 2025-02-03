package javacore.algorithm.leetcode.under2100;

/**
 * 2091. Removing Minimum and Maximum From Array
 */
public class RemovingMinimumAndMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[min] > nums[i])
                min = i;
            else if (nums[max] < nums[i])
                max = i;
        }
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        return Math.min(max + 1, Math.min(n - min, min + 1 + n - max));
    }
}
