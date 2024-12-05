package javacore.algorithm.leetcode.under3000;

/**
 * 2980. Check if Bitwise OR Has Trailing Zeros
 */
public class CheckIfBitwiseORHasTrailingZeros {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2  == 0)    count++;
        }
        return count >= 2;
    }
}
