package javacore.algorithm.leetcode.under2500;

/*
 * Leet code 2446. Determine if Two Events Have Conflict
 */
public class DetermineIfTwoEventsHaveConflict {
	public boolean haveConflict(String[] event1, String[] event2) {
        int min1 = timeToNumber(event1[0]);
        int min2 = timeToNumber(event2[0]);
        int max1 = timeToNumber(event1[1]);
        int max2 = timeToNumber(event2[1]);
        return !((min1 > max2) || (max1 < min2));
    }
    
    private int timeToNumber(String time) {
        String[] timeArr = time.split(":");
        return Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
    }
}
