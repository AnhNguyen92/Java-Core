package javacore.algorithm.leetcode.under2800;

/**
 * 2798. Number of Employees Who Met the Target
 */
public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i : hours) {
            count += i >= target ? 1 : 0;
        }
        return count;
    }
}
