package javacore.algorithm.leetcode.under3300;

import java.util.*;

/**
 * 3243. Shortest Distance After Road Addition Queries I
 */
public class ShortestDistanceAfterRoadAdditionQueriesI {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        Graph graph = new Graph(n);
        for (int i = 0; i < queries.length; i++) {
            graph.addEdge(queries[i][0], queries[i][1]);
            ans[i] = graph.findPath(0, n-1);
        }
        return ans;
    }

    public class Graph {
        private Map<Integer, List<Integer>> adjList;

        public Graph(int vertices) {
            adjList = new HashMap<>();
            for (int i = 0; i < vertices - 1; i++) {
                List<Integer> lst = new ArrayList<>();
                lst.add(i+1);
                adjList.put(i, lst);
            }
        }

        public void addEdge(int u, int v) {
            adjList.get(u).add(v);
        }

        public int findPath(int start, int end) {
            if (start == end) return 1;

            Map<Integer, Integer> parentMap = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            queue.offer(start);
            visited.add(start);
            parentMap.put(start, null);

            while (!queue.isEmpty()) {
                int current = queue.poll();
                if (current == end) {
                    return reconstructPath(parentMap, start, end);
                }
                for (int neighbor : adjList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                        parentMap.put(neighbor, current);
                    }
                }
            }
            return adjList.size() - 1;
        }

        private int reconstructPath(Map<Integer, Integer> parentMap, int start, int end) {
            int path = 0;
            for (Integer at = end; at != null; at = parentMap.get(at)) {
                path++;
            }
            return path - 1;
        }
    }
}
