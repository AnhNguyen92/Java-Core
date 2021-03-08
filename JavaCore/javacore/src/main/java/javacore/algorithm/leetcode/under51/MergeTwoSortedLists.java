package javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.ListNode;
/*
 * Leetcode #21
 */
public class MergeTwoSortedLists {
	private static final Logger logger = LoggerFactory.getLogger(MergeTwoSortedLists.class);

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode l3 = mergeTwoLists(l1, l2);
		while(l3.next != null) {
			logger.info("{}", l3.val);
			l3 = l3.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
