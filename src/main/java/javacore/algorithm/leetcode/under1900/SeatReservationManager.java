package javacore.algorithm.leetcode.under1900;

import java.util.PriorityQueue;

/*
 * LeetCode 1845. Seat Reservation Manager
 */
public class SeatReservationManager {
	class SeatManager {
	    PriorityQueue<Integer> pQueue;
	    public SeatManager(int n) {
	        pQueue = new PriorityQueue<>(n);
	        for (int i = 1; i <= n; i++) {
	            pQueue.add(i);
	        }
	    }
	    
	    public int reserve() {
	        return pQueue.poll();
	    }
	    
	    public void unreserve(int seatNumber) {
	        pQueue.offer(seatNumber);
	    }
	}
}
