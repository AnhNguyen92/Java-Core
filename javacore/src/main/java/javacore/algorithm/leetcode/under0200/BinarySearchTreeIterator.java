package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 173
 */
public class BinarySearchTreeIterator {
	class BSTIterator {
		List<Integer> lst = new ArrayList<>();
		int index = 0;

		public BSTIterator(TreeNode root) {
			travel(lst, root);
		}

		public int next() {
			return lst.get(index++).intValue();
		}

		public boolean hasNext() {
			return index < lst.size();
		}

		private void travel(List<Integer> lst, TreeNode root) {
			if (root != null) {
				travel(lst, root.left);
				lst.add(root.val);
				travel(lst, root.right);
			}
		}
	}

	/**
	 * Your BSTIterator object will be instantiated and called as such: BSTIterator
	 * obj = new BSTIterator(root); int param_1 = obj.next(); boolean param_2 =
	 * obj.hasNext();
	 */
}
