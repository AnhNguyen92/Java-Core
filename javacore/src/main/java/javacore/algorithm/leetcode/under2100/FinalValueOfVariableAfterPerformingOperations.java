package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2011. Final Value of Variable After Performing Operations
*/
public class FinalValueOfVariableAfterPerformingOperations {
	public int finalValueAfterOperations(String[] operations) {
		int val = 0;
		for (String s : operations) {
			if (s.startsWith("-") || s.endsWith("-")) {
				val--;
			} else {
				val++;
			}
		}

		return val;
	}
}
