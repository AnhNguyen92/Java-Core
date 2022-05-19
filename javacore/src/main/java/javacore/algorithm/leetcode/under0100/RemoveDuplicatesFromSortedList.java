package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.ListNode;


/*
 * LeetCode 83
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp = head;
            while (temp != null && temp.next != null) {
                if (temp.val == temp.next.val) {
                    ListNode nextNode = temp.next;
                    temp.next = nextNode.next;
                } else {
                    temp = temp.next;
                }
            }
        }
        
        return head;
    }

}
