package javacore.algorithm.leetcode.under2500;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2442. Count Number of Distinct Integers After Reverse Operations
 */
public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        StringBuilder s;
        for (int i : nums) {
            set.add(i);
            s = new StringBuilder("" + i).reverse();
            set.add(Integer.parseInt(s.toString()));
        }
        return set.size();
    }
}
