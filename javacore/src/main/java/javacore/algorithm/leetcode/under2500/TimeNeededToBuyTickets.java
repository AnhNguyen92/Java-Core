package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2073
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
