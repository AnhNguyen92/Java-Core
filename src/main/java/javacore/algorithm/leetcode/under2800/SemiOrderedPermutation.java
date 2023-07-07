package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2717. Semi-Ordered Permutation
 */
public class SemiOrderedPermutation {
	public int semiOrderedPermutation(int[] nums) {
        int x = 0;
        int n = nums.length;
        int y = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                x = i;
            }
            if (nums[i] == n) {
                y = i;
            }
        }
        if (x < y) {
            return x + (n-y-1);
        }
        return x + (n-y-1) - 1;
    }
}
