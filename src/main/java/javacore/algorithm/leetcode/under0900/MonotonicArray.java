package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 896. Monotonic Array
 */
public class MonotonicArray {
	public boolean isMonotonic(int[] a) {
		int asc = 0;
		int desc = 0;
		boolean notFound = true;
		int i = 0;
		while (i < a.length - 1 && notFound) {
			if (a[i] < a[i + 1])
				asc = 1;
			else if (a[i] > a[i + 1])
				desc = 1;
			if (asc + desc == 2)
				notFound = false;
			i++;
		}

		return (asc + desc != 2);
	}
}
