package javacore.algorithm.leetcode.under3000;

/**
 * 2908. Minimum Sum of Mountain Triplets I
 */
public class MinimumSumOfMountainTripletsI {
    public int minimumSum(int[] nums) {
        int sum = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[i]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] > nums[k]) {
                            if (sum == -1 || sum > (nums[i] + nums[j] + nums[k])) {
                                sum = nums[i] + nums[j] + nums[k];
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }
}
