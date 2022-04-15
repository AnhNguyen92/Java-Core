package javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode #2
 */

public class AddTwoNumbers {
    private static final Logger logger = LoggerFactory.getLogger(AddTwoNumbers.class);

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l3 = addTwoNumbers(l1, l2);
        logger.info("{}", l3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int remember) {
        ListNode result = new ListNode();

        if (l1 != null) {
            if (l2 == null) { // l1 != null && l2 == null
                result.val = (l1.val + remember) % 10;
                result.next = addTwoNumbers(l1.next, null, (l1.val + remember) / 10);
            } else { // l1 != null && l2 != null
                result.val = (l1.val + l2.val + remember) % 10;
                result.next = addTwoNumbers(l1.next, l2.next, (l1.val + l2.val + remember) / 10);
            }
        } else {
            if (l2 != null) {
                result.val = (l2.val + remember) % 10;
                result.next = addTwoNumbers(null, l2.next, (l2.val + remember) / 10);
            } else {
                if (remember > 0) {
                    result.next = null;
                    result.val = 1;
                } else {
                    result = null;
                }
            }
        }

        return result;
    }

}
