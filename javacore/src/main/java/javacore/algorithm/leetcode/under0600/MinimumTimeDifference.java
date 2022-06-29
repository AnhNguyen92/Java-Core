package javacore.algorithm.leetcode.under0600;

import java.util.Collections;
import java.util.List;

/*
 * LeetCode 539
 */
public class MinimumTimeDifference {
	public int findMinDifference(List<String> timePoints) {
		Collections.sort(timePoints);
		int n = timePoints.size();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = diffTime(timePoints.get(i), timePoints.get((i + 1) % n));
		}
		return minArr(arr);
	}

	private int minArr(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		return min;
	}

	private int diffTime(String first, String second) {
		String[] sp1 = first.split(":");
		String[] sp2 = second.split(":");
		int h1 = Integer.parseInt(sp1[0]);
		int h2 = Integer.parseInt(sp2[0]);
		int m1 = Integer.parseInt(sp1[1]);
		int m2 = Integer.parseInt(sp2[1]);
		if (h1 == h2) {
			return Math.abs(m2 - m1);
		}
		if (h1 < h2) {
			int temp = h1;
			h1 = h2;
			h2 = temp;
			temp = m1;
			m1 = m2;
			m2 = temp;
		}
		int a = (h1 - h2) * 60 + m1 - m2;
		int b = (24 - h1 + h2) * 60 + m2 - m1;
		return min(a, b);
	}

	private int min(int a, int b) {
		if (a < b)
			return a;
		return b;
	}
}
