package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1376. Time Needed to Inform All Employees
 */
public class TimeNeededToInformAllEmployees {
	public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int m;
        int max = 0;
        int time;
        for (int i = 0; i < n; i++) {
            time = informTime[i];
            m = manager[i];
            while (m >= 0) {
                time += informTime[m];
                m = manager[m];
            }
            max = Math.max(time, max);
        }
        
        return max;
    }
}
