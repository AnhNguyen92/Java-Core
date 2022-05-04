package javacore.algorithm.leetcode.under100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.ListNode;


/*
 * LeetCode 83
 */
public class RemoveDuplicatesFromSortedList {
    private static Logger logger = LoggerFactory.getLogger(RemoveDuplicatesFromSortedList.class);

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3,new ListNode(3, null)))));
        ListNode newHead = deleteDuplicates(head);
        while (newHead != null) {
            logger.info("{}", newHead.val);
            newHead = newHead.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
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
