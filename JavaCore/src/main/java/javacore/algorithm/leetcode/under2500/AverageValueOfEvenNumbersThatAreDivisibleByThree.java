package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2455. Average Value of Even Numbers That Are Divisible by Three
 */
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
	public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i : nums) {
            if (i % 6 == 0) {
                sum += i;
                count++;
            }
        }
        
        return (count > 0) ? (sum / count) : 0;
    }
}
