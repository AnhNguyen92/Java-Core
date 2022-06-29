package javacore.algorithm.leetcode.under1200;

import java.util.Arrays;

/*
 * LeetCode 1170
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {
	public int[] numSmallerByFrequency(String[] queries, String[] words) {
		int[] frequency = new int[queries.length];
		int i;
		for (int j = 0; j < queries.length; j++) {
			String s = queries[j];
			char[] crr = s.toCharArray();
			Arrays.sort(crr);
			int count = 1;
			i = 1;
			while (i < crr.length && crr[i] == crr[0]) {
				count++;
				i++;
			}
			frequency[j] = count;
		}
		int[] ans = new int[words.length];
		for (int j = 0; j < words.length; j++) {
			String s = words[j];
			char[] crr = s.toCharArray();
			Arrays.sort(crr);
			int count = 1;
			i = 1;
			while (i < crr.length && crr[i] == crr[0]) {
				count++;
				i++;
			}
			ans[j] = count;
		}
		for (int j = 0; j < frequency.length; j++) {
			int count = 0;
			i = 1;
			while (i < ans.length && ans[i] == ans[0]) {
				count++;
				i++;
			}
			frequency[j] = count;
		}
		return frequency;
	}
}
