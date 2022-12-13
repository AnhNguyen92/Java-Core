package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1299. Replace Elements with Greatest Element on Right Side
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
	public int[] replaceElements(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				arr[i - 1] = arr[i];
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			ans[i] = arr[i + 1];
		}
		ans[arr.length - 1] = -1;
		return ans;
	}
}
