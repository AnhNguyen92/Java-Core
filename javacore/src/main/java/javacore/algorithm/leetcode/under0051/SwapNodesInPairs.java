package javacore.algorithm.leetcode.under0051;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 24
 */
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            swap(head.next.next);
        }
        
        return head;
    }
    
    private void swap(ListNode head) {
        if (head != null && head.next != null) {
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            swap(head.next.next);
        }
    }
}
