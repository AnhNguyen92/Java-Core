package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 622. Design Circular Queue
 */
public class DesignCircularQueue {
	class MyCircularQueue {
		List<Integer> lst;
		int capacity = 0;
		int size;

		public MyCircularQueue(int k) {
			lst = new ArrayList<>(k);
			capacity = k;
			size = 0;
		}

		public boolean enQueue(int value) {
			if (size < capacity) {
				lst.add(value);
				size++;
				return true;
			}
			return false;
		}

		public boolean deQueue() {
			if (size > 0) {
				lst.remove(0);
				size--;
				return true;
			}
			return false;
		}

		public int Front() {
			return size == 0 ? -1 : lst.get(0);
		}

		public int Rear() {
			return size == 0 ? -1 : lst.get(size - 1);
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public boolean isFull() {
			return size == capacity;
		}
	}

	/**
	 * Your MyCircularQueue object will be instantiated and called as such:
	 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
	 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
	 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
	 * boolean param_6 = obj.isFull();
	 */
}
