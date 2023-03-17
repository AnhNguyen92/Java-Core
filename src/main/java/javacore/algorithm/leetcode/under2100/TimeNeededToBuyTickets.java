package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2073. Time Needed to Buy Tickets
*/
public class TimeNeededToBuyTickets {
	public int timeRequiredToBuy(int[] tickets, int k) {
		int count = 0;
		while (tickets[k] > 0) {
			for (int i = 0; i < tickets.length; i++) {
				if (tickets[i] != 0) {
					count++;
					tickets[i]--;
					if (tickets[i] == 0 && i == k) {
						break;
					}
				}
			}
		}
		return count;
	}
}
