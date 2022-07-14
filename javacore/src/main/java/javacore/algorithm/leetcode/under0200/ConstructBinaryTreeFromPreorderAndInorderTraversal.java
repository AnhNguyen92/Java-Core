package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 105
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	Map<Integer, Integer> inorderMap = new HashMap<>();
    int idx = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}
		return buildTree(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}

		TreeNode treeNode = new TreeNode(preorder[idx++]);
		treeNode.left = buildTree(preorder, start, inorderMap.get(treeNode.val) - 1);
		treeNode.right = buildTree(preorder, inorderMap.get(treeNode.val) + 1, end);

		return treeNode;
	}

}
