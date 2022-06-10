package javacore.algorithm.leetcode.under1800;

/*
 * Leetcode 1742
 */
public class MaximumNumberOfBallsInABox {
	public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[81];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = sum(i);
            arr[sum]++;
        }
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }
    
    private int sum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}