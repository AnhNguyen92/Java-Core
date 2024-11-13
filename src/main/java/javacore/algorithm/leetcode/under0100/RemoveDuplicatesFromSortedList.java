package javacore.algorithm.leetcode.under0100;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 83. Remove Duplicates from Sorted List
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            ListNode temp = head;
            while (temp.next != null) {
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
