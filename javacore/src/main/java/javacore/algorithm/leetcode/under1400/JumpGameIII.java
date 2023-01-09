package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1306. Jump Game III
 */
public class JumpGameIII {
	public boolean canReach(int[] arr, int start) {
		return canReach(arr, start, new int[arr.length]);
	}

	private boolean canReach(int[] arr, int start, int[] check) {

		if (start < 0 || start >= arr.length)
			return false;
		if (check[start] == 1) {
			return false;
		}
		if (arr[start] == 0) {
			return true;
		}
		check[start] = 1;
		return canReach(arr, start + arr[start], check) || canReach(arr, start - arr[start], check);
	}

	// reference better
	public boolean canReach2(int[] arr, int start) {
		if (start < 0 || start >= arr.length || arr[start] == -1) {
			return false;
		}
		if (arr[start] == 0) {
			return true;
		}
		int temp = arr[start];
		arr[start] = -1;

		boolean result = canReach2(arr, start + temp) || canReach2(arr, start - temp);
		arr[start] = temp;
		return result;
	}

}
