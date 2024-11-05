package javacore.algorithm.leetcode.under2900;

import javacore.algorithm.leetcode.model.ListNode;

/**
 * 2816. Double a Number Represented as a Linked List
 */
public class DoubleANumberRepresentedAsALinkedList {
    public ListNode doubleIt(ListNode head) {
        int reminder = traverse(head, 0);
        if (reminder > 0) {
            return new ListNode(reminder, head);
        }
        return head;
    }

    private int traverse(ListNode head, int reminder) {
        if (head == null) {
            return 0;
        }
        reminder = traverse(head.next, reminder);
        int val = head.val * 2 + reminder;
        head.val = val % 10;
        return val / 10;

    }
}
