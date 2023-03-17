package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2287. Rearrange Characters to Make Target String
 */
public class RearrangeCharactersToMakeTargetString {
	public int rearrangeCharacters(String s, String target) {
		int [] a = new int[26];
        int [] b = new int[26];
		for (char c : s.toCharArray())
			a[c - 'a']++;
		for (char c : target.toCharArray())
			b[c - 'a']++;
		int frequency = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (b[i] > 0) {
				if (a[i] == 0)
					return 0;
				frequency = Math.min(frequency, a[i] / b[i]);
			}
		}

		return frequency;
	}
}