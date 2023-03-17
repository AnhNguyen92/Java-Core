package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1370. Increasing Decreasing String
 */
public class IncreasingDecreasingString {
	public String sortString(String s) {
		char[] alphabets = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int count = s.length();
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		char[] result = new char[count];
		while (count > 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					result[s.length() - count] = alphabets[i];
					arr[i]--;
					count--;
				}
			}
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] > 0) {
					result[s.length() - count] = alphabets[i];
					arr[i]--;
					count--;
				}
			}
		}

		return new String(result);
	}
}
