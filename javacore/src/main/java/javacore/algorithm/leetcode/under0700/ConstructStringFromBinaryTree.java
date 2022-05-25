package javacore.algorithm.leetcode.under0700;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 606
 */
public class ConstructStringFromBinaryTree {
	
	public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        travel(root, sb);
        return sb.toString();
    }
    
    private void travel(TreeNode root, StringBuilder sb) {
        if (root != null) {
            sb.append(root.val);
            if (root.left == null) {
                if (root.right != null) {
                    sb.append("()");
                    sb.append("(");
                    travel(root.right, sb);
                    sb.append(")");
                }                
            } else {
                sb.append("(");
                travel(root.left, sb);
                sb.append(")");
                if (root.right != null) {
                    sb.append("(");
                    travel(root.right, sb);
                    sb.append(")");
                }
            }
        }
    }
}
