package javacore.algorithm.leetcode.under3200;

/**
 * 3151. Special Array I
 */
public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (((nums[i - 1] ^ nums[i]) & 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
