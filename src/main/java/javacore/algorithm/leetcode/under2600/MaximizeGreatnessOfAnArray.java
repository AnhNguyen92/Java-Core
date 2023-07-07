package javacore.algorithm.leetcode.under2600;

import java.util.PriorityQueue;

/*
 * LeetCode 2592. Maximize Greatness of an Array
 */
public class MaximizeGreatnessOfAnArray {
	public int maximizeGreatness(int[] nums) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i: nums){
            pq1.add(i);
            pq2.add(i);
        }
        int count = 0;
        while(!pq2.isEmpty()){
            if(pq1.peek() < pq2.peek()){
                pq1.poll();
                count++;
            }
            pq2.poll();
        }
        return count;
    }
}
