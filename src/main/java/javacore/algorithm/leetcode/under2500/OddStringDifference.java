package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;

/*
 * LeetCode 2451. Odd String Difference
 */
public class OddStringDifference {
	public String oddString(String[] words) {
		String word = words[0];
		int n = word.length();
		int[] arr = findArr(word, n);
		int[] arr1 = findArr(words[1], n);
		int[] arr2 = findArr(words[2], n);
		if (!Arrays.equals(arr, arr1)) {
			if(!Arrays.equals(arr, arr2)) {
				return words[0];
			}
			return words[1];
		} else if (!Arrays.equals(arr, arr2)) {
            return words[2];
		}
		for (int i = 3; i < words.length; i++) {
			int[] tempArr = findArr(words[i], n);
			if (!Arrays.equals(arr, tempArr)) {
                return words[i];
			}
		}
		return words[0];
	}

	private int[] findArr(String word, int n) {
		int[] arr = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = word.charAt(i+1) - word.charAt(i);
		}
		return arr;
	}
}
