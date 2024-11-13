package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 567. Permutation in String
 */
public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2)
			return false;
		int[] arr1 = frequentArr(s1);
		int[] arr2 = frequentArr(s2.substring(0, len1));
		if (isInclude(arr1, arr2)) {
			return true;
		}
		for (int i = 1; i <= len2 - len1; i++) {
			arr2[s2.charAt(i - 1) - 'a']--;
			arr2[s2.charAt(i + len1 - 1) - 'a']++;
			if (isInclude(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

	private boolean isInclude(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] !=  arr2[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] frequentArr(String s) {
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		return arr;
	}
}
