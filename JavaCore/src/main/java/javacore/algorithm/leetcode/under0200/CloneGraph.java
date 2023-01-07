package javacore.algorithm.leetcode.under0200;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.graph.Node;

/*
 *  Leetcode 133. Clone Graph
 */
public class CloneGraph {
	/*
	 * // Definition for a Node. class Node { public int val; public List<Node>
	 * neighbors; public Node() { val = 0; neighbors = new ArrayList<Node>(); }
	 * public Node(int _val) { val = _val; neighbors = new ArrayList<Node>(); }
	 * public Node(int _val, ArrayList<Node> _neighbors) { val = _val; neighbors =
	 * _neighbors; } }
	 */

	class Solution {
		Map<Node, Node> map = new HashMap<>();

		public Node cloneGraph(Node node) {
			if (node == null) {
				return null;
			}
			Node clone;
			if (map.get(node) == null) {
				clone = new Node(node.val);
				map.put(node, clone);
			} else {
				clone = map.get(node);
			}
			if (node.neighbors != null) {
				for (Node n : node.neighbors) {
					if (map.get(n) == null)
						clone.neighbors.add(cloneGraph(n));
					else
						clone.neighbors.add(map.get(n));
				}
			}
			return clone;
		}
	}
}
