package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1002. Find Common Characters
 */
public class FindCommonCharacters {
	public List<String> commonChars(String[] A) {
		int[] array = find(A, 0, A.length - 1);
		List<String> result = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			int times = array[i];
			for (int j = 0; j < times; j++) {
				result.add(String.valueOf((char) (i + 97)));
			}
		}

		return result;
	}

	private static int[] find(String[] a, int left, int right) {
		int[] result = new int[26];
		if (left == right) {
			char[] s = a[left].toCharArray();
			for (int i = 0; i < s.length; i++) {
				result[s[i] - 'a']++;
			}

			return result;
		}

		int mid = left + (right - left) / 2;

		int[] leftResult = new int[26];
		int[] rightResult = new int[26];
		if (left == mid) {
			char[] s = a[left].toCharArray();
			for (int i = 0; i < s.length; i++) {
				leftResult[s[i] - 'a']++;
			}

			s = a[right].toCharArray();
			for (int i = 0; i < s.length; i++) {
				rightResult[s[i] - 'a']++;
			}
		} else {
			leftResult = find(a, left, mid - 1);
			rightResult = find(a, mid, right);
		}

		// intersect of the both side results...
		for (int i = 0; i < result.length; i++) {
			if (leftResult[i] > 0 && rightResult[i] > 0) {
				result[i] = Math.min(leftResult[i], rightResult[i]);
			}
		}

		return result;
	}

	public List<String> commonChars1(String[] a) {
		int[] arr = new int[26];
		for (char c : a[0].toCharArray()) {
			arr[c - 'a']++;
		}
		for (int i = 1; i < a.length; i++) {
			int[] arr1 = new int[26];
			for (char c : a[i].toCharArray()) {
				arr1[c - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				arr[j] = Math.min(arr[j], arr1[j]);
			}
		}
		String[] srr = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				lst.add(srr[i]);
			}
		}
		return lst;
	}
}
