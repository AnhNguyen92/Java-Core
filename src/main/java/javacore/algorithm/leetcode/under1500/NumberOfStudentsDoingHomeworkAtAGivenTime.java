package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1450. Number of Students Doing Homework at a Given Time
 */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
				count++;
			}
		}
		return count;
	}
}
