package javacore.algorithm.leetcode.under2400;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.*;

/**
 * 2385. Amount of Time for Binary Tree to Be Infected
 */
public class AmountOfTimeForBinaryTreeToBeInfected {

    Map<Integer, Integer> distance = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {
        Graph graph = new Graph(root);
        return graph.maxDistanceFromSource(start);
    }
}

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph(TreeNode root) {
        adjacencyList = new HashMap<>();
        travel(root);
    }

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public int maxDistanceFromSource(int source) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> distance = new HashMap<>();

        queue.add(source);
        visited.add(source);
        distance.put(source, 0);

        int maxDistance = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentDistance = distance.get(current);

            for (int neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    distance.put(neighbor, currentDistance + 1);
                    maxDistance = Math.max(maxDistance, currentDistance + 1);
                }
            }
        }

        return maxDistance;
    }

    public void travel(TreeNode root) {
        if (root != null) {
            addVertex(root.val);
            if (root.left != null) {
                addEdge(root.val, root.left.val);
                travel(root.left);
            }
            if (root.right != null) {
                addEdge(root.val, root.right.val);
                travel(root.right);
            }
        }
    }

}
