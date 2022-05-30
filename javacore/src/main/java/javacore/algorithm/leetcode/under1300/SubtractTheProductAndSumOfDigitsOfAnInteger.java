package javacore.algorithm.leetcode.under1300;

/*
 * Leetcode 1281
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiply = 1;
        int temp;
        while (n > 0) {
            temp = n % 10;
            sum += temp;
            multiply *= temp;
            n /=10;
        }
        return multiply - sum;
    }
}
