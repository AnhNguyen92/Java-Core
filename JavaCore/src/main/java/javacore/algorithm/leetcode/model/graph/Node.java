package javacore.algorithm.leetcode.model.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val, List<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}
