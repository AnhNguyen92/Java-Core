package javacore.algorithm.leetcode.under0200;

import javacore.algorithm.leetcode.model.graph.Node;

import java.util.HashMap;
import java.util.Map;

/*
 *  LeetCode 133. Clone Graph
 */
public class CloneGraph {
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
