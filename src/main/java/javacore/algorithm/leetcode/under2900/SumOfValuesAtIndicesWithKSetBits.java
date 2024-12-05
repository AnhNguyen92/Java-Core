package javacore.algorithm.leetcode.under2900;

import java.util.List;

/**
 * 2859. Sum of Values at Indices With K Set Bits
 */
public class SumOfValuesAtIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++)
            if (Integer.bitCount(i) == k)
                count += nums.get(i);
        return count;
    }
}
