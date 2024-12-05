package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 919. Complete Binary Tree Inserter
 */
public class CompleteBinaryTreeInserter {
    class CBTInserter {
        List<TreeNode> lst = new ArrayList<>();
        TreeNode root;
        public CBTInserter(TreeNode root) {
            this.root = root;
            travel(root);
        }

        public int insert(int val) {
            TreeNode node = new TreeNode(val);
            lst.add(node);
            int idx = lst.size()-1;
            TreeNode parent = lst.get((idx-1)/2);
            if (idx % 2 == 1)
                parent.left = node;
            else
                parent.right = node;
            return parent.val;
        }

        public TreeNode get_root() {
            return root;
        }

        public void travel(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                lst.add(current);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
}
