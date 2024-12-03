package javacore.algorithm.leetcode.under0800;

/**
 * 775. Global and Local Inversions
 */
public class GlobalAndLocalInversions {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < i - 1 || nums[i] > i + 1) {
                return false;
            }
        }
        return true;
    }
}
