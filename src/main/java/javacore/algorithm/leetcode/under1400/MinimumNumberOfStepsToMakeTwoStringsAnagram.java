package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1347. Minimum Number of Steps to Make Two Strings Anagram
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
	public int minSteps(String s, String t) {
		int[] crr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			crr[s.charAt(i) - 'a']++;
			crr[t.charAt(i) - 'a']--;
		}
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (crr[i] > 0) {
				count += crr[i];
			}
		}
		return count;
	}
}
