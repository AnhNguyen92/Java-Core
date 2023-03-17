package javacore.algorithm.leetcode.under1500;

import java.util.LinkedList;

/*
 * LeetCode 1472. Design Browser History
 */
public class DesignBrowserHistory {
	class BrowserHistory {
	    private int curPageIdx;
	    private LinkedList<String> lst;

	    public BrowserHistory(String homepage) {
	        curPageIdx = 0;
	        lst = new LinkedList<>();
	        lst.add(homepage);
	    }
	    
	    public void visit(String url) {
	        lst.subList(curPageIdx + 1, lst.size()).clear();
	        curPageIdx++;
	        lst.add(url);
	    }
	    
	    public String back(int steps) {
	        curPageIdx -= steps;
	        if (curPageIdx < 0) {
	            curPageIdx = 0;
	        }
	        return lst.get(curPageIdx);
	    }
	    
	    public String forward(int steps) {
	        curPageIdx += steps;
	        if (curPageIdx >= lst.size()) {
	            curPageIdx = lst.size() - 1;
	        }
	        return lst.get(curPageIdx);
	    }
	}

	/**
	 * Your BrowserHistory object will be instantiated and called as such:
	 * BrowserHistory obj = new BrowserHistory(homepage);
	 * obj.visit(url);
	 * String param_2 = obj.back(steps);
	 * String param_3 = obj.forward(steps);
	 */
}
