package javacore.algorithm.leetcode.under0051;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 2. Add Two Numbers
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int remember) {
        ListNode result = new ListNode();

        if (l1 != null) {
            if (l2 == null) {
                result.val = (l1.val + remember) % 10;
                result.next = addTwoNumbers(l1.next, null, (l1.val + remember) / 10);
            } else {
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
