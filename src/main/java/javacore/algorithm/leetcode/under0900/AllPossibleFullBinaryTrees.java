package javacore.algorithm.leetcode.under0900;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 894. All Possible Full Binary Trees
 */
public class AllPossibleFullBinaryTrees {
    List<TreeNode> ans = new ArrayList<>();
    Map<Integer, List<TreeNode>> map = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> lst;
        List<TreeNode> prev = new ArrayList<>();
        for (int i = 1; i < n - 2; i+=2) {
            lst = new ArrayList<>();
            if (n == 1) {
                lst.add(new TreeNode());
            } else {
                for (TreeNode node : prev) {
                    TreeNode temp = clone(new TreeNode(), node);
                    List<TreeNode> leaves = new ArrayList<>();
                    travel(leaves, temp);
                    for (TreeNode leaf : leaves) {
                        leaf.left = new TreeNode();
                        leaf.right = new TreeNode();
                        lst.add(temp);
                        leaf = new TreeNode();
                    }
                }
            }
            prev = lst;
            map.put(i, lst);
        }
        for (int i = 1; i <= n-2; i += 2) {
            List<TreeNode> left = map.get(i);
            List<TreeNode> right = map.get(n-i);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    ans.add(new TreeNode(0, l, r));
                }
            }
        }
        return ans;
    }

    private void travel(List<TreeNode> leaves, TreeNode node) {
        if (node != null) {
            if (node.left != null && node.right != null) {
                leaves.add(node);
            } else {
                travel(leaves, node.left);
                travel(leaves, node.right);
            }
        }
    }

    private TreeNode clone(TreeNode a, TreeNode b) {
        if (a != null && b != null) {
            a.left = clone(new TreeNode(), b.left);
            a.right = clone(new TreeNode(), b.right);
        }
        return a;
    }
}
