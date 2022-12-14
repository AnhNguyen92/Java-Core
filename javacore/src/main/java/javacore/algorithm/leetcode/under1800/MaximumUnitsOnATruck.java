package javacore.algorithm.leetcode.under1800;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Leetcode 1710. Maximum Units on a Truck
 */
public class MaximumUnitsOnATruck {
	public int maximumUnits(int[][] boxTypes, int truckSize) {
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int[] boxType : boxTypes) {
            queue.offer(boxType);
        }
        
        int maxUnits = 0;
        while(truckSize != 0 && !queue.isEmpty()) {
            int[] row = queue.poll();
            int boxes = Math.min(truckSize, row[0]);
            
            maxUnits += boxes * row[1];            
            truckSize -= boxes;
        }
        
        return maxUnits;
    }
}
