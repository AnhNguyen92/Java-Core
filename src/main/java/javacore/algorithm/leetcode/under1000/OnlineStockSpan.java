package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 901. Online Stock Span
 */
public class OnlineStockSpan {
	List<Integer> list = new ArrayList<>();

	public OnlineStockSpan() {
	}

	public int next(int price) {
		list.add(price);
		int count = 1;
		int i = list.size() - 2;
		while (i >= 0 && list.get(i) <= price) {
			count++;
			i--;
		}
		return count;
	}

}
