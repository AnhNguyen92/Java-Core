package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1381
 */
public class DesignAStackWithIncrementOperation {
	class CustomStack {
	    private List<Integer> lst;
	    private int size;
	    
	    public CustomStack(int maxSize) {
	        lst = new ArrayList<>(maxSize);
	        size = maxSize;
	    }
	    
	    public void push(int x) {
	        if (lst.size() < size) {
	            lst.add(0, x);
	        }
	    }
	    
	    public int pop() {
	        if (!lst.isEmpty()) {
	            int x = lst.get(0);
	            lst.remove(0);
	            return x;
	        }
	        return -1;
	    }
	    
	    public void increment(int k, int val) {
	        int start = (lst.size() - k > 0) ? (lst.size() - k) : 0;
	        for (int i = start; i < lst.size(); i++) {
	            lst.set(i, lst.get(i) + val);
	        }
	    }
	}

	/**
	 * Your CustomStack object will be instantiated and called as such:
	 * CustomStack obj = new CustomStack(maxSize);
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * obj.increment(k,val);
	 */
}
