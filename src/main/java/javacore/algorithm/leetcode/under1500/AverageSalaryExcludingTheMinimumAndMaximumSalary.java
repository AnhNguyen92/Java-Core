package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;

/*
 * LeetCode 1491. Average Salary Excluding the Minimum and Maximum Salary
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
	public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        
        return (double) sum / (salary.length - 2);
    }
}
