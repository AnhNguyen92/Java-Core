package javacore.java8.sort;

import java.util.Arrays;

public class ArraySorting {
	public void sort2DimensionArray(int[][] arr) {
		Arrays.sort(arr, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			}
			return a[0] - b[0];
		});
	}
}
