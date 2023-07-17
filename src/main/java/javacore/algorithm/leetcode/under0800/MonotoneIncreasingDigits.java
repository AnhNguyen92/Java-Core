package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 738. Monotone Increasing Digits
 */
public class MonotoneIncreasingDigits {
	public int monotoneIncreasingDigits(int n) {
		String s = "" + n;
		int[] arr = new int[s.length()];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = n % 10;
			n /= 10;
		}
		boolean hasChange = false;
		do {
			hasChange = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					arr[i]--;
					hasChange = true;
					for (int j = i + 1; j < arr.length; j++) {
						arr[j] = 9;
					}
				}
			}
		} while (hasChange);
		int ans = 0;
		for (int i : arr) {
			ans = ans * 10 + i;
		}
		return ans;
	}
}
