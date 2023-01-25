package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * LeetCode 237. Delete Node in a Linked List
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
