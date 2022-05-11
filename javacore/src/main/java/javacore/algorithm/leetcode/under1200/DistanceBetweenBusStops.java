package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1184
 */
public class DistanceBetweenBusStops {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        int firstWay = 0;
        int n1 = Math.min(start, destination);
        int n2 = Math.max(start, destination);
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
            if (i >= n1 && i < n2) {
                firstWay += distance[i];
            }
        }
        return Math.min(sum - firstWay, firstWay);
    }
}
