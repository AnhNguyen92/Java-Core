package javacore.algorithm.leetcode.under1600;

import java.util.Arrays;

/*
 * LeetCode 1502. Can Make Arithmetic Progression From Sequence
 */
public class CanMakeArithmeticProgressionFromSequence {
	public boolean canMakeArithmeticProgression(int[] arr) {
		if (arr.length == 2)
			return true;
		Arrays.sort(arr);
		int diff = arr[1] - arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != diff)
				return false;
		}
		return true;
	}
}
