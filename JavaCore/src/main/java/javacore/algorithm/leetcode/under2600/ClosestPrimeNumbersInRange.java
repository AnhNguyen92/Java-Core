package javacore.algorithm.leetcode.under2600;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2523. Closest Prime Numbers in Range
 */
public class ClosestPrimeNumbersInRange {
	public int[] closestPrimes(int left, int right) {
		List<Integer> lst = new ArrayList<>();

		boolean[] brr = new boolean[right + 1];
		for (int i = 2; i <= right; i++) {
			brr[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(right); i++) {
			if (brr[i]) {
				for (int j = i * i; j <= right; j += i) {
					brr[j] = false;
				}
			}
		}
		for (int i = left; i <= right; i++) {
			if (brr[i]) {
				lst.add(i);
			}
		}
		if (lst.size() < 2) {
			return new int[] { -1, -1 };
		}
		int[] arr = new int[] { lst.get(0), lst.get(1) };
		int minus = arr[1] - arr[0];
		int cur;
		int prev = arr[1];
		for (int i = 2; i < lst.size(); i++) {
			cur = lst.get(i);
			if (minus > cur - prev) {
				minus = cur - prev;
				arr[0] = prev;
				arr[1] = cur;
			}
			prev = cur;
		}
		return arr;
	}
}
