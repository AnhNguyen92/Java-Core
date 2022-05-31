package javacore.algorithm.leetcode.under0800;

import java.util.PriorityQueue;

/*
 * LeetCode 703
 */
public class KthLargestElementInAStream {
	PriorityQueue<Integer> pq;
	int limit;

	public KthLargestElementInAStream(int k, int[] nums) {
		pq = new PriorityQueue<>(k);
		this.limit = k;
		for (int n : nums) {
			add(n);
		}
	}

	// function to add element, and keep the elements in pq always have top K
	// Largest element
	// pq's peak will be the return value
	public int add(int val) {
		if (pq.size() < limit) {
			pq.add(val);
		} else if (val > pq.peek()) {
			pq.poll();
			pq.add(val);
		}
		return pq.peek();
	}
	
//	int kth;
//    List<Integer> list= new ArrayList<>();
//    public KthLargestElementInAStream(int k, int[] nums) {
//        kth = k;
//        for(int i : nums)
//            list.add(i);
//    }
//    
//    public int add(int val) {
//        list.add(val);
//        Collections.sort(list);
//        return list.get(list.size() - kth);
//    }
}
