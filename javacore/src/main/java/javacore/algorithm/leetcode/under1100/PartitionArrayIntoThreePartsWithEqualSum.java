package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1013
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
	public boolean canThreePartsEqualSum(int[] arr) {
		int count = 0;
		int sum = 0;
		for (int i : arr)
			sum += i;
		if (sum % 3 != 0)
			return false;
		int i = 0;
		int partion = sum / 3;
		int temp = 0;
		while (i < arr.length) {
			temp += arr[i];
			if (temp == partion) {
				temp = 0;
				count++;

			}
			i++;
			if (count == 2 && i < arr.length) {
				return true;
			}
		}
		return count == 3;
	}
}
