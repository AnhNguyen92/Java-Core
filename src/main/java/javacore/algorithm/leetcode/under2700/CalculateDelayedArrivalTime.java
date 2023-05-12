package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2651. Calculate Delayed Arrival Time
 */
public class CalculateDelayedArrivalTime {
	public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
		return (arrivalTime + delayedTime) % 24;
	}
}
