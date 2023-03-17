package javacore.algorithm.leetcode.under2500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 2476. Closest Nodes Queries in a Binary Search Tree
 */
public class ClosestNodesQueriesInABinarySearchTree {
	List<Integer> lst = new ArrayList<>();

	public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        traverse(root);
        List<List<Integer>>  ans = new ArrayList<>();
        int n = lst.size();
        for (int i : queries) {
            int a = min(0, n - 1, i);
            int b = a == i ? i : max(0, n - 1, i);
            
            List<Integer> item = Arrays.asList(a, b);
            ans.add(item);
        }
        return ans;
    }

    private int max(int l, int r, int x) {
        int mid;
        while (r  - l > 1) {
            mid = (r + l) / 2;
            if (lst.get(mid) == x)
                return x;
            if (lst.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }                
        }
        if (lst.get(l) >= x) {
            return lst.get(l);
        } else if (lst.get(r) >= x) {
            return lst.get(r);
        }
        return -1;
    }

    private int min(int l, int r, int x) {
        int mid;
        while (r - l > 1) {
            mid = (r + l) / 2;
            if (lst.get(mid) == x)
                return x;
            if (lst.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        if (lst.get(r) <= x) {
            return lst.get(r);
        } else if (lst.get(l) <= x) {
            return lst.get(l);
        }
        return -1;
    }

    private void traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            lst.add(root.val);
            traverse(root.right);
        }
    }
}
