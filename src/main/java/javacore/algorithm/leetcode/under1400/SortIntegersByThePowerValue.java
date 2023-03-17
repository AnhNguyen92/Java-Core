package javacore.algorithm.leetcode.under1400;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1387. Sort Integers by The Power Value
 */
public class SortIntegersByThePowerValue {
	Map<Integer, Integer> map = new HashMap<>();

	public int getKth(int lo, int hi, int k) {
		int[][] arr = new int[hi - lo + 1][2];
		for (int i = lo; i <= hi; i++) {
			arr[i - lo][0] = i;
			arr[i - lo][1] = power(i);
		}
		Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
		return arr[k - 1][0];
	}

	private int power(int i) {
		if (i == 1)
			return 0;
		if (map.get(i) != null)
			return map.get(i);
		int k;
		if (i % 2 == 0)
			k = power(i / 2);
		else
			k = power(i * 3 + 1);
		map.put(i, k + 1);

		return k + 1;
	}
}
