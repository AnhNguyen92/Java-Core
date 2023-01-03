package javacore.algorithm.leetcode.under2600;

import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode 2521. Distinct Prime Factors of Product of Array
 */
public class DistinctPrimeFactorsOfProductOfArray {
	public int distinctPrimeFactors(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int number : nums) {
			for (int i = 2; i < number; i++) {
				while (number % i == 0) {
					set.add(i);
					number = number / i;
				}
			}
			if (number >= 2) {
				set.add(number);
			}
		}
		return set.size();
	}
}
