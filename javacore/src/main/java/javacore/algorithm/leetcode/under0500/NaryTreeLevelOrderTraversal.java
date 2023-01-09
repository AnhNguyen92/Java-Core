package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.NodeList;

/*
 * Leetcode 429. N-ary Tree Level Order Traversal
 */
public class NaryTreeLevelOrderTraversal {
	List<List<Integer>> lst;
    public List<List<Integer>> levelOrder(NodeList root) {
        lst = new ArrayList<>();
        travel(root, 0);
        
        return lst;
    }
    
    private void travel(NodeList root, int level) {
        if (root != null) {
            if (level == lst.size()) {
                lst.add(new ArrayList<>());
            }
            List<Integer> item = lst.get(level);
            item.add(root.val);
            if (root.children != null) {
                for (NodeList node : root.children) {
                    travel(node, level + 1);
                }
            }
        }
    }
}
