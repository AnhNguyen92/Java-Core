package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1456. Maximum Number of Vowels in a Substring of Given Length
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
	public int maxVowels(String s, int k) {
		int count = 0;
		int n = s.length();
		int[] arr = new int[n];
		char c;
		for (int i = 0; i < k; i++) {
			c = s.charAt(i);
			if (isVowel(c)) {
				arr[i] = 1;
				count++;
			}
		}
		int max = count;

		for (int i = k; i < n; i++) {
			c = s.charAt(i);
			if (isVowel(c)) {
				arr[i] = 1;
				count++;
			}
			count -= arr[i - k];
			if (max < count) {
				max = count;
			}
		}
		return max;
	}

	private boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}
