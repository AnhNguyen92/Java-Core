package javacore.algorithm.leetcode.under1700;

import java.util.PriorityQueue;

/*
 * LeetCode 1642. Furthest Building You Can Reach
 */
public class FurthestBuildingYouCanReach {

	public int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > heights[i - 1]) {
				ladders--;
				queue.add(heights[i] - heights[i - 1]);
				if (ladders < 0) {
					bricks -= queue.poll();
					if (bricks < 0) {
						return i - 1;
					}
					ladders++;
				}
			}
		}
		return heights.length - 1;
	}

}
