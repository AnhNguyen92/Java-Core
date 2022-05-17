package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacore.algorithm.leetcode.model.Node;

/*
 * LeetCode 117
 */
public class PopulatingNextRightPointersInEachNodeII {
	public Node connect(Node root) {
		Node valNode = root;
		Map<Integer, List<Node>> valMap = new HashMap<>();
		populateVal(valMap, valNode, 0);
		Node head = new Node(0);
		head.left = root;
		populate(root, valMap, 0);
		return head.left;
	}

	private void populateVal(Map<Integer, List<Node>> map, Node root, int height) {
		if (root != null) {
			List<Node> lst = map.computeIfAbsent(height, h -> new ArrayList<>());
			lst.add(root);
			populateVal(map, root.left, height + 1);
			populateVal(map, root.right, height + 1);
		}
	}

	private void populate(Node root, Map<Integer, List<Node>> valMap, int height) {
		if (root != null) {
			List<Node> lst = valMap.get(height);
			int i = lst.indexOf(root);
			if (i < lst.size() - 1) {				
				root.next = lst.get(i + 1);
			}
			populate(root.left, valMap, height + 1);
			populate(root.right, valMap, height + 1);
		}
	}

}
