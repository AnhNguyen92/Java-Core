package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1342
 */
public class NumberOfStepsToReduceANumberToZero {
	public int numberOfSteps(int num) {
		return reduce(num, 0);
	}

	public int reduce(int num, int count) {
		if (num == 0)
			return count;
		if (num % 2 == 0)
			return reduce(num / 2, count + 1);
		return reduce(num - 1, count + 1);
	}
}
