package javacore.algorithm.leetcode.under51;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javacore.algorithm.leetcode.model.ListNode;

public class MergeKSortedLists {
    private static final Logger logger = LoggerFactory.getLogger(MergeKSortedLists.class);

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = new ListNode[] { node1, node2, node3 };
        ListNode merge = mergeKLists(lists);
        while (merge != null) {
            logger.info("{}", merge.val);
            merge = merge.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        if (lists.length == 0) {
            ListNode head  = new ListNode(-1);
            return head.next;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        if (lists.length == 2) {
            return mergeTwoListNode(lists[0], lists[1]);
        } else {
            int r = lists.length - 1;
            int m = r / 2;
            int n1 = m + 1;
            int n2 = r - m;
            ListNode[] left = new ListNode[n1];
            ListNode[] right = new ListNode[n2];
            System.arraycopy(lists, 0, left, 0, n1);
            System.arraycopy(lists, m + 1, right, 0, n2);
            ListNode mergeLeft = mergeKLists(left);
            ListNode mergeRight = mergeKLists(right);

            return mergeTwoListNode(mergeLeft, mergeRight);
        }
    }

    public static ListNode mergeTwoListNode(ListNode left, ListNode right) {
        ListNode head = new ListNode(0);
        ListNode mergeListNode = head;
        if (left == null)
            return right;
        if (right == null)
            return left;
        while (left != null || right != null) {
            if (left == null) {
                mergeListNode.next = right;
                right = null;
            } else if (right == null) {
                mergeListNode.next = left;
                left = null;
            } else {
                if (left.val <= right.val) {
                    mergeListNode.next = new ListNode(left.val);
                    left = left.next;
                } else {
                    mergeListNode.next = new ListNode(right.val);
                    right = right.next;
                }
                mergeListNode = mergeListNode.next;
            }
        }

        return head.next;
    }

}
