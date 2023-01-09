package javacore.algorithm.leetcode.under0051;

/*
 * Leetcode 16. 3Sum Closest
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int nearestSum = Integer.MIN_VALUE;
        int tempSum;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    tempSum = nums[i] + nums[j] + nums[k];
                    if (Math.abs((long) target - tempSum) < Math.abs((long) target - nearestSum)) {
                        nearestSum = tempSum;
                    }
                }
            }
        }

        return nearestSum;
    }

}
