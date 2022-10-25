package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2432
 */
public class TheEmployeeThatWorkedOnTheLongestTask {
	public int hardestWorker(int n, int[][] logs) {
        int max = -1;
        int empId = 0;
        int start = 0;
        int time;
        for (int i = 0; i < logs.length; i++) {
            time = logs[i][1] - start;
            start = logs[i][1];
            if (time > max) {
                max = time;
                empId = logs[i][0];
            }
            if (time == max && logs[i][0] < empId) {
                empId = logs[i][0];
            }
        }
        return empId;
    }
}
