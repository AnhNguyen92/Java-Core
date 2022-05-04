package javacore.algorithm.leetcode.under200;

/*
 * LeetCode 167
 */
public class TwoSumIIInputArrayIsSorted {
	public int[] twoSum(int[] numbers, int target) {
		int[] ar = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] > target) {
				j--;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				ar[0] = i + 1;
				ar[1] = j + 1;
				break;
			}
		}
		return ar;
	}
}
