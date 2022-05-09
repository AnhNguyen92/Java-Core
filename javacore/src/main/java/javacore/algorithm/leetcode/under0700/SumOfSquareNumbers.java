package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 633
 */
public class SumOfSquareNumbers {
	public boolean judgeSquareSum(int c) {
		for (long a = 0; a * a <= c; a++) {
			int b = c - (int) (a * a);
			if (binarySearch(0, b, b))
				return true;
		}
		return false;
	}

	public boolean binarySearch(long s, long e, int n) {
		if (s > e)
			return false;
		long mid = s + (e - s) / 2;
		if (mid * mid == n)
			return true;
		if (mid * mid > n)
			return binarySearch(s, mid - 1, n);
		return binarySearch(mid + 1, e, n);
	}
}
