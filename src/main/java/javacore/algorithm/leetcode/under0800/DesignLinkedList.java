package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 707. Design Linked List
 */
public class DesignLinkedList {
	private List<Integer> lst = new ArrayList<>();

	public DesignLinkedList() {
        
    }

	public int get(int index) {
		if (index < lst.size()) {
			return lst.get(index);
		}
		return -1;
	}

	public void addAtHead(int val) {
		lst.add(0, val);
	}

	public void addAtTail(int val) {
		lst.add(val);
	}

	public void addAtIndex(int index, int val) {
		if (index < lst.size()) {
			lst.add(index, val);
		} else if (index == lst.size()) {
			lst.add(val);
		}

	}

	public void deleteAtIndex(int index) {
		if (index < lst.size()) {
			lst.remove(index);
		}
	}
}

/**
 * Your DesignLinkedList object will be instantiated and called as such:
 * DesignLinkedList obj = new DesignLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */