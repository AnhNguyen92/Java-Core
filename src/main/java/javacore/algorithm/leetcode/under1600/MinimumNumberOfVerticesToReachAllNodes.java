package javacore.algorithm.leetcode.under1600;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 1557. Minimum Number of Vertices to Reach All Nodes
 */
public class MinimumNumberOfVerticesToReachAllNodes {
	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		Set<Integer> from = new HashSet<>();
		Set<Integer> to = new HashSet<>();
		for (int i = 0; i < edges.size(); i++) {
			List<Integer> item = edges.get(i);
			from.add(item.get(0));
			to.add(item.get(1));
		}
		from.removeAll(to);
		return new ArrayList<>(from);
	}
}
