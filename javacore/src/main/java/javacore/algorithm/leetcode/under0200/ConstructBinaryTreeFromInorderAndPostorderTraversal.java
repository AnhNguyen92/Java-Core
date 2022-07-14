package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 106
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	Map<Integer, Integer> inorderMap;
    int idx;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	inorderMap = new HashMap<>();
    	idx = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}
		return arrayToTree(postorder, 0, postorder.length - 1);
    }
    
    private TreeNode arrayToTree(int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}

		TreeNode treeNode = new TreeNode(preorder[idx--]);
		treeNode.right = arrayToTree(preorder, inorderMap.get(treeNode.val) + 1, end);
		treeNode.left = arrayToTree(preorder, start, inorderMap.get(treeNode.val) - 1);

		return treeNode;
	}
}
