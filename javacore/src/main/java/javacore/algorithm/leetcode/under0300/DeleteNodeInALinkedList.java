package javacore.algorithm.leetcode.under0300;

import javacore.algorithm.leetcode.model.ListNode;

/*
 * Leet code #237
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
