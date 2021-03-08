package javacore.algorithm.leetcode.under300;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * Leet code #234
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // if (head == null || head.next == null) return true;
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        while (head != null) {
            s1.append(head.val);
            s2.insert(0, head.val);
            head = head.next;
        }

        return s1.toString().equals(s2.toString());
    }
}
