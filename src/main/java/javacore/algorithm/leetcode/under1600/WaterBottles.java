package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1518. Water Bottles
 */
public class WaterBottles {
	public int numWaterBottles(int numBottles, int numExchange) {
		int total = 0;
		int full = numBottles;
		while (full >= numExchange) {
			int temp = full / numExchange;
			full = full - temp * (numExchange - 1);
			total += temp * numExchange;
		}
		return total + full;
	}
}
