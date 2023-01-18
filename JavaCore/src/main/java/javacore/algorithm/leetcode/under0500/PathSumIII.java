package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 437. Path Sum III
 */
public class PathSumIII {
	int count = 0;
	Map<TreeNode, Boolean> map = new HashMap<>();

	public int pathSum(TreeNode root, int targetSum) {
		travel(root, 0, targetSum);
		return count;
	}

	private void travel(TreeNode root, long sum, long target) {
		if (root == null) {
			return;
		}
		sum += root.val;
		if (sum == target) {
			count++;
		}
		if (root.left != null) {
			if (map.get(root.left) == null) {
				travel(root.left, 0, target);
				map.put(root.left, true);
			}
			travel(root.left, sum, target);
		}
		if (root.right != null) {
			if (map.get(root.right) == null) {
				travel(root.right, 0, target);
				map.put(root.right, true);
			}
			travel(root.right, sum, target);
		}
	}
}
