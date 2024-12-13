package javacore.algorithm.leetcode.under3000;

import java.util.Arrays;

/**
 * 2971. Find Polygon With the Largest Perimeter
 */
public class FindPolygonWithTheLargestPerimeter {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
