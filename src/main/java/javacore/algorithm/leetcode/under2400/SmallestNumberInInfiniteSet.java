package javacore.algorithm.leetcode.under2400;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * LeetCode 2336. Smallest Number in Infinite Set
 */
public class SmallestNumberInInfiniteSet {
	class SmallestInfiniteSet {
		PriorityQueue<Integer> queue;

	    public SmallestInfiniteSet() {
	    	queue = new PriorityQueue<>(Comparator.reverseOrder());
	        for (int i = 1; i <= 1000; i++) {
				queue.add(i);
			}
	    }
	    
	    public int popSmallest() {
	        return queue.poll().intValue();
	    }
	    
	    public void addBack(int num) {
	        if (!queue.contains(num)) {
	        	queue.add(num);
	        }
	    }
	}
	
	/**
	 * Your SmallestInfiniteSet object will be instantiated and called as such:
	 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
	 * int param_1 = obj.popSmallest();
	 * obj.addBack(num);
	 */
	
}
