package javacore.algorithm.leetcode.under2500;

/*
 * Leet code 2433. Find The Original Array of Prefix Xor
 */
public class FindTheOriginalArrayOfPrefixXor {
	public int[] findArray(int[] pref) {
		for (int i = 1; i < pref.length; i++) {
			pref[i] = pref[i] ^ pref[i - 1];
		}

		return pref;
	}
}
