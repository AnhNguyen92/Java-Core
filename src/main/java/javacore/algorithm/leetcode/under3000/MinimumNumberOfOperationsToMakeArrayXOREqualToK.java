package javacore.algorithm.leetcode.under3000;

/**
 * 2997. Minimum Number of Operations to Make Array XOR Equal to K
 */
public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
    public int minOperations(int[] nums, int k) {
        for (int num : nums) {
            k ^= num;
        }
        return countBits(k);
    }

    private int countBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}
