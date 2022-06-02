package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 729
 */
public class MyCalendarI {

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
}
