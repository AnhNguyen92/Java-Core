package javacore.algorithm.leetcode.under1400;

import javacore.algorithm.leetcode.model.ListNode;
import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1367. Linked List in Binary Tree
 */
public class LinkedListInBinaryTree {
	public boolean isSubPath(ListNode head, TreeNode root) {
        return isEqual(root, head, false);
    }

    public boolean isEqual(TreeNode root, ListNode head, boolean cont) {
        if (head == null) {
            return cont;
        }
        if (root == null) {
            return false;
        }
        if (cont) {
            return head.val == root.val && (isEqual(root.left, head.next, true) || isEqual(root.right, head.next, true));
        } else {
            if (head.val == root.val) {
                if (isEqual(root.left, head.next, true) || isEqual(root.right, head.next, true)) {
                    return true;
                }
                return isEqual(root.left, head, false) || isEqual(root.right, head, false);
            }
            return isEqual(root.left, head, false) || isEqual(root.right, head, false);
        }
    }
}
