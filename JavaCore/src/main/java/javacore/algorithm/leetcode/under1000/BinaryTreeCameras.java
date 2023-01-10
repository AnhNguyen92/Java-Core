package javacore.algorithm.leetcode.under1000;

import java.util.HashSet;
import java.util.Set;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 968. Binary Tree Cameras
 */
public class BinaryTreeCameras {
	Set<TreeNode> covered = new HashSet<>();
	int numsOfCam = 0;

	public int minCameraCover(TreeNode root) {
		covered.add(null);
		getCover(root, null);
		if (!covered.contains(root)) {
			numsOfCam++;
		}
		return numsOfCam;
	}

	private void getCover(TreeNode node, TreeNode parrent) {
		if (node != null) {
			getCover(node.left, node);
			getCover(node.right, node);
			if (parrent == null && !covered.contains(node) || !covered.contains(node.left)
					|| !covered.contains(node.right)) {
				covered.add(node);
				covered.add(parrent);
				covered.add(node.left);
				covered.add(node.right);
				numsOfCam++;
			}
		}
	}
}
