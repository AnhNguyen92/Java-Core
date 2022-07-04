package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode 406
 */
public class QueueReconstructionByHeight {
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> {
			if (a[0] != b[0]) {
				return b[0] - a[0];
			}
			return a[1] - b[1];
		});
		List<int[]> arr = new ArrayList<>();
		for (int[] p : people) {
			arr.add(p[1], p);
		}
		return arr.toArray(new int[people.length][2]);
	}

}
