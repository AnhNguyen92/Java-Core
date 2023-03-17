package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1460. Make Two Arrays Equal by Reversing Subarrays
 */
public class MakeTwoArraysEqualByReversingSubArrays {
	public boolean canBeEqual(int[] target, int[] arr) {
		int[] hash = new int[1001];
		boolean result = true;
		for (int i = 0; i < target.length; i++) {
			hash[target[i]] += 1;
			hash[arr[i]] -= 1;
		}
		for (int i = 0; i < hash.length; i++) {
			if (hash[i] != 0) {
				result = false;
				break;
			}
		}

		return result;
	}
}
