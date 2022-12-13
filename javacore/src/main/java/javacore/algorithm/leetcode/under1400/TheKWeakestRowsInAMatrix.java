package javacore.algorithm.leetcode.under1400;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
 * LeetCode 1337. The K Weakest Rows in a Matrix
 */
public class TheKWeakestRowsInAMatrix {
	public int binarySearch(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == 1)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return start;
	}

	public int[] kWeakestRows(int[][] mat, int k) {
		// 2d array to store number of 1's and its corresponding index
		int[][] sorted = new int[mat.length][2];
		for (int i = 0; i < mat.length; i++) {
			int index = new TheKWeakestRowsInAMatrix().binarySearch(mat[i]);
			sorted[i][0] = index;
			sorted[i][1] = i;
		}

		// Sort the 2d array in increasing order by comparing number of 1's
		Arrays.sort(sorted, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		// Make a new array to store first k weakest indices
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = sorted[i][1];
		}

		return result;
	}

	public int[] kWeakestRows1(int[][] mat, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < mat.length; i++) {
			int count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					count++;
			}
			map.put(i, count);
		}
		List<Integer> lst = map.entrySet().stream()
				.sorted((Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) -> o1.getValue().equals(o2.getValue())
						? o1.getKey().compareTo(o2.getKey())
						: o1.getValue().compareTo(o2.getValue()))
				.map(Entry::getKey).collect(Collectors.toList());
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = lst.get(i).intValue();
		}
		return res;
	}
}
