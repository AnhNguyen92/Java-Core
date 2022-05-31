package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.ListNode;
import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 109
 */
public class ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        
        return insertAVLTree(lst, 0, lst.size() - 1);
    }
    
    private TreeNode insertAVLTree(List<Integer> lst, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(lst.get(mid));
        root.left = insertAVLTree(lst, start, mid - 1);
        root.right = insertAVLTree(lst, mid + 1, end);
        
        return root;
    }
}
