package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2310. Sum of Numbers With Units Digit K
 */
public class SumOfNumbersWithUnitsDigitK {
	public int minimumNumbers(int num, int k) {
		if (num != k && num % 10 == k)
            return 1;
        if (num == 0)
            return 0;
        if (k == 0)
        	return -1;
        int b;
        for (int i = 1; i <= num / k; i++) {
            b = (num - k * i) / 10;
            if (i * k + 10 * b == num)
                return i;
        }
        return -1;
    }
}
