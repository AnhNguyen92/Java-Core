package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * LeetCode 1647. Minimum Deletions to Make Character Frequencies Unique
 */
public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
	public int minDeletions(String s) {
        int[] arr = new int[26];
		for (char c : s.toCharArray())
			arr[c - 'a']++;
		Arrays.sort(arr);
		int max = arr[25] + 1;
		int delete = 0;
		for (int i = 25; i >= 0; i--) {
			if (arr[i] == 0)
				break;
			if (arr[i] > max) {
				delete += arr[i] - max;
				if (max > 0) {
					max--;
				}
			} else if (arr[i] > 0 && arr[i] <= max) {
				max = arr[i] - 1;
			}
		}
		return delete;
    }
	
}
