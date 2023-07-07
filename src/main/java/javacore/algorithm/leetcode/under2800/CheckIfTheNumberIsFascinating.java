package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2729. Check if The Number is Fascinating
 */
public class CheckIfTheNumberIsFascinating {
	public boolean isFascinating(int n) {
		int[] arr = new int[10];
		int t = n * 3;
		while (t > 0) {
			arr[t % 10]++;
			t /= 10;
		}
		t = n * 2;
		while (t > 0) {
			arr[t % 10]++;
			t /= 10;
		}
		while (n > 0) {
			arr[n % 10]++;
			n /= 10;
		}
		for (int i = 1; i < 10; i++) {
			if (arr[i] != 1)
				return false;
		}
		return true;
	}
}
