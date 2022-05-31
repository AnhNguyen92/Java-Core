package javacore.algorithm.leetcode.under0051;

import javacore.algorithm.leetcode.model.ListNode;
/*
 * Leetcode 21
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		if (l1 != null) {
        	if (l2 == null) {
        		result = l1;
        	} else {
        		if (l1.val <= l2.val) {
        			result.val = l1.val;
            		result.next = mergeTwoLists(l1.next, l2);
        		} else {
        			result.val = l2.val;
            		result.next = mergeTwoLists(l1, l2.next);
        		}
        		
        	}
        } else { // l1 null
        	result = l2;
        }
		
		return result;
    }
}
