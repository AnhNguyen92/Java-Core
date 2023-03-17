package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 641. Design Circular Deque
 */
public class DesignCircularDeque {
	class MyCircularDeque {
	    List<Integer> lst;
	    int capacity = 0;
	    int size;
	    public MyCircularDeque(int k) {
	        lst = new ArrayList<>(k);
	        capacity = k;
	        size = 0;
	    }
	    
	    public boolean insertFront(int value) {
	        if (size < capacity) {
	            lst.add(0, value);
	            size++;
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean insertLast(int value) {
	        if (size < capacity) {
	            lst.add(value);
	            size++;
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean deleteFront() {
	        if (size > 0) {
	            lst.remove(0);
	            size--;
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean deleteLast() {
	        if (size > 0) {
	            lst.remove(size - 1);
	            size--;
	            return true;
	        }
	        return false;
	    }
	    
	    public int getFront() {
	        return size == 0 ? -1 : lst.get(0);
	    }
	    
	    public int getRear() {
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
	 * Your MyCircularDeque object will be instantiated and called as such:
	 * MyCircularDeque obj = new MyCircularDeque(k);
	 * boolean param_1 = obj.insertFront(value);
	 * boolean param_2 = obj.insertLast(value);
	 * boolean param_3 = obj.deleteFront();
	 * boolean param_4 = obj.deleteLast();
	 * int param_5 = obj.getFront();
	 * int param_6 = obj.getRear();
	 * boolean param_7 = obj.isEmpty();
	 * boolean param_8 = obj.isFull();
	 */
}
