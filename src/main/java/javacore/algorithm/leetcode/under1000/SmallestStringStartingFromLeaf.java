package javacore.algorithm.leetcode.under1000;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * LeetCode 988. Smallest String Starting From Leaf
 */
public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        List<String> lst = new ArrayList<>();
        travel(lst, root, "");
        lst.sort(Comparator.comparing(String::toString)
                .thenComparingInt(String::length));
        return lst.get(0);
    }

    private void travel(List<String> lst, TreeNode root, String s) {
        if (root != null) {
            s = (char) ('a' + root.val) + s;
            if (root.left == null && root.right == null)
                lst.add(s);
            else
            if (root.left != null)
                travel(lst, root.left, s);
            if (root.right != null)
                travel(lst, root.right, s);
        }
    }
}
