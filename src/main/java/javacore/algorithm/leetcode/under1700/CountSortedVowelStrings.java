package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1641. Count Sorted Vowel Strings
 */
public class CountSortedVowelStrings {
	char[] arr = new char[] { 'a', 'e', 'i', 'o', 'u' };
	int ans = 0;

	public int countVowelStrings(int n) {
		backTracking(new StringBuilder(), n, 0);
		return ans;
	}

	private void backTracking(StringBuilder sb, int n, int start) {
		if (sb.length() == n) {
			ans++;
		} else {
			for (int i = start; i < arr.length; i++) {
				sb.append(arr[i]);
				backTracking(sb, n, i);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}

	// reference
	public int countVowelStrings2(int n) {
		return backTracking2(n, 0, 5);
	}

	private int backTracking2(int n, int start, int count) {
		if (n == 0) {
			return 1;
		}
		int result = 0;
		for (int i = start; i < 5; i++) {
			result += backTracking2(n - 1, i, count);
		}
		return result;
	}

}
