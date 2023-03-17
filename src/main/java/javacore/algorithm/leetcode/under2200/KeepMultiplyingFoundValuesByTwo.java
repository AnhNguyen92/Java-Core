package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * LeetCode 2154. Keep Multiplying Found Values by Two
 */
public class KeepMultiplyingFoundValuesByTwo {
	public int findFinalValue(int[] nums, int original) {
		Set<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int ans = original;
		while (lst.contains(ans)) {
			ans *= 2;
		}
		return ans;
	}
}
