package javacore.algorithm.leetcode.under1700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1670. Design Front Middle Back Queue
*/
public class DesignFrontMiddleBackQueue {
	class FrontMiddleBackQueue {
	    List<Integer> lst;
	    public FrontMiddleBackQueue() {
	        lst = new ArrayList<>();
	    }
	    
	    public void pushFront(int val) {
	        lst.add(0, val);
	    }
	    
	    public void pushMiddle(int val) {
	        lst.add(lst.size() / 2, val);
	    }
	    
	    public void pushBack(int val) {
	        lst.add(val);
	    }
	    
	    public int popFront() {
	        if (lst.isEmpty()) {
	            return -1;
	        }
	        int res = lst.get(0);
	        lst.remove(0);
	        return res;
	    }
	    
	    public int popMiddle() {
	        if (lst.isEmpty()) {
	            return -1;
	        }
	        int i = lst.size() / 2 - 1;
	        
	        if (lst.size() % 2 == 1) {
	            i += 1;
	        }
	        int res = lst.get(i);
	        lst.remove(i);
	        return res;
	    }
	    
	    public int popBack() {
	        if (lst.isEmpty()) {
	            return -1;
	        }
	        int res = lst.get(lst.size() - 1);
	        lst.remove(lst.size() - 1);
	        return res;
	    }
	}

	/**
	 * Your FrontMiddleBackQueue object will be instantiated and called as such:
	 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
	 * obj.pushFront(val);
	 * obj.pushMiddle(val);
	 * obj.pushBack(val);
	 * int param_4 = obj.popFront();
	 * int param_5 = obj.popMiddle();
	 * int param_6 = obj.popBack();
	 */
}
