package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2544. Alternating Digit Sum
 */
public class AlternatingDigitSum {
	public int alternateDigitSum(int n) {
        int count = 0;
        int sum = 0;
        boolean dic = true;
        while (n > 0) {
            count++;
            sum += dic ? (n % 10) : (0 - n % 10);
            dic = !dic;
            n /= 10;
        }
        return (count % 2 == 1) ? sum : (0 - sum);
    }
}
