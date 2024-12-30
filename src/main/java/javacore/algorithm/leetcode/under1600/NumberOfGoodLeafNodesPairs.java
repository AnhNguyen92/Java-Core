package javacore.algorithm.leetcode.under1600;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1530. Number of Good Leaf Nodes Pairs
 */
public class NumberOfGoodLeafNodesPairs {
    int ans = 0;
    public int countPairs(TreeNode root, int distance) {
        travel(root, distance);
        return ans;
    }

    private List<Integer> travel(TreeNode root, int distance) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            if (root.left == null && root.right == null) {
                res.add(0);
            } else {
                List<Integer> left = travel(root.left, distance);
                List<Integer> right = travel(root.right, distance);
                for (int i : left) {
                    if (i < distance - 1) {
                        res.add(i+1);
                    }
                }
                int len= res.size();
                for (int j : right) {
                    for (int i = 0; i < len; i++) {
                        if (res.get(i) + j + 1 <= distance)
                            ans++;
                    }
                    if (j < distance - 1)
                        res.add(j+1);
                }
            }
        }
        return res;
    }
}
