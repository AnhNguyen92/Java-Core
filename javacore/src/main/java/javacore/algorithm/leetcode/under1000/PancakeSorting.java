package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 969
 */
public class PancakeSorting {
	public List<Integer> pancakeSort(int[] arr) {
		List<Integer> lst = new ArrayList<>();
		int end = arr.length - 1;
		while (end > 0) {
			int max = findMax(arr, end);
			if (max == arr.length - 1) {
				end--;
				continue;
			}
			if (max > 0) {
				flip(arr, lst, max);
			}
			flip(arr, lst, end);
			end--;
		}

		return lst;
	}

	private void flip(int[] arr, List<Integer> lst, int end) {
		int temp;
		for (int i = 0; i <= end / 2; i++) {
			temp = arr[i];
			arr[i] = arr[end - i];
			arr[end - i] = temp;
		}
		lst.add(end + 1);
	}

	private int findMax(int[] arr, int end) {
		int max = 0;
		for (int i = 1; i <= end; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
}
