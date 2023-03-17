package javacore.algorithm.leetcode.under2600;

import java.util.Arrays;

/*
 * LeetCode 2545. Sort the Students by Their Kth Score
 */
public class SortTheStudentsByTheirKthScore {
	public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (n1, n2) -> (n2[k] - n1[k]));
        return score;
    }
}
