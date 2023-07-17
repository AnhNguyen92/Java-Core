package javacore.algorithm.leetcode.under0500;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 449. Serialize and Deserialize BST
 */
public class SerializeAndDeserializeBST {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		buildStr(root, sb);
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data.isEmpty()) {
			return null;
		}
		String[] srr = data.split(",");
		int n = srr.length;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(srr[i]);
		}
		return arrayToTree(arr, 0, n - 1);
	}

	private void buildStr(TreeNode root, StringBuilder sb) {
		if (root != null) {
			sb.append(root.val).append(",");
			buildStr(root.left, sb);
			buildStr(root.right, sb);
		}
	}

	private TreeNode arrayToTree(int[] preorder, int i, int j) {
		if (i > preorder.length - 1 || i > j)
			return null;
		TreeNode tree = new TreeNode(preorder[i]);
		int k = i + 1;
		while (k <= j && preorder[k] < preorder[i]) {
			k++;
		}
		tree.left = arrayToTree(preorder, i + 1, k - 1);
		tree.right = arrayToTree(preorder, k, j);

		return tree;
	}

}
