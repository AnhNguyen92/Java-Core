package javacore.algorithm.leetcode.under2900;

import javacore.algorithm.leetcode.model.ListNode;

/**
 * 2807. Insert Greatest Common Divisors in Linked List
 */
public class InsertGreatestCommonDivisorsInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = insertGreatestCommonDivisors(head.next);
        head.next = new ListNode(gcd(head.val, head.next.val), head.next);
        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
