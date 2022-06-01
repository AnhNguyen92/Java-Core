package javacore.algorithm.leetcode.under0800;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * LeetCode 729
 */
public class MyCalendarI {
	public static void main(String[] args) {
		MyCalendar calendar = new MyCalendar();

		String[] tasks = new String[] { "MyCalendar", "book", "book", "book", "book", "book", "book", "book", "book",
				"book", "book", "book", "book", "book", "book", "book", "book", "book", "book", "book", "book", "book",
				"book", "book", "book", "book", "book", "book", "book", "book", "book" };
		int[][] nums = new int[][] { { 20, 29 }, { 13, 22 }, { 44, 50 }, { 1, 7 }, { 2, 10 }, { 14, 20 }, { 19, 25 },
				{ 36, 42 }, { 45, 50 }, { 47, 50 }, { 39, 45 }, { 44, 50 }, { 16, 25 }, { 45, 50 }, { 45, 50 },
				{ 12, 20 }, { 21, 29 }, { 11, 20 }, { 12, 17 }, { 34, 40 }, { 10, 18 }, { 38, 44 }, { 23, 32 },
				{ 38, 44 }, { 15, 20 }, { 27, 33 }, { 34, 42 }, { 44, 50 }, { 35, 40 }, { 24, 31 } };
		for (int[] arr : nums) {
			calendar.book(arr[0], arr[1]);
		}
	}

}

class MyCalendar {
	int[][] arr = new int[1000][2];
	int index = 0;

	public MyCalendar() {

	}

	public boolean book(int start, int end) {
		for (int i = 0; i < index; i++) {
			if ((start < arr[i][0] && arr[i][0] < end) || (arr[i][0] <= start && start < arr[i][1])) {
				return false;
			}
		}
		arr[index][0] = start;
		arr[index][1] = end;
		index++;

		return true;
	}
}

/**
 * Your MyCalendar object will be instantiated and called as such: MyCalendar
 * obj = new MyCalendar(); boolean param_1 = obj.book(start,end);
 */
