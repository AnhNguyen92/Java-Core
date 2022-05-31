package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 114
 */
public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if (root != null) {
            travel(lst, root.left);
            travel(lst, root.right);
            root.left = null;
            root.right = null;
            addNode(root, lst, lst.size() - 1);
        }
    }
    
    private void addNode(TreeNode root, List<Integer> lst, int index) {
        if (index >= 0) {
            root.right = new TreeNode(lst.get(index), null, root.right);
            addNode(root, lst, index - 1);
        }
    }
    
    private void travel(List<Integer> lst, TreeNode root) {
        if (root != null) {
            lst.add(root.val);
            travel(lst, root.left);
            travel(lst, root.right);
        }
    }
}
