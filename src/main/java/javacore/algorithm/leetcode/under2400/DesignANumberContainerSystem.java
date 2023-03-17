package javacore.algorithm.leetcode.under2400;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * LeetCode 2349. Design a Number Container System
 */
public class DesignANumberContainerSystem {
	class NumberContainers {
	    Map<Integer, Integer> idxMap;
	    Map<Integer, PriorityQueue<Integer>> orderedMap;

	    public NumberContainers() {
	        idxMap = new HashMap<>();
	        orderedMap = new HashMap<>();
	    }
	    
	    public void change(int index, int number) {
	        idxMap.put(index, number);
	        orderedMap.computeIfAbsent(number, n -> new PriorityQueue<>());
	        orderedMap.get(number).add(index);
	    }
	    
	    public int find(int number) {
	        PriorityQueue<Integer> queue = orderedMap.get(number);
	        if (queue == null || queue.isEmpty()) {
	            return -1;
	        }
	        while (!queue.isEmpty()) {
	            if (idxMap.get(queue.peek()) != number) {
	                queue.poll();
	            } else {
	                return queue.peek();
	            }
	        }
	        return -1;
	    }
	}

	/**
	 * Your NumberContainers object will be instantiated and called as such:
	 * NumberContainers obj = new NumberContainers();
	 * obj.change(index,number);
	 * int param_2 = obj.find(number);
	 */
}
