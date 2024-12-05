package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 207. Course Schedule
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph graph = new Graph(numCourses);
        for (int i = 0; i < prerequisites.length; i++) {
            graph.addEdge(prerequisites[i][0], prerequisites[i][1]);
        }
        return !graph.isCyclic();
    }

    class Graph {
        private int v;
        private List<List<Integer>> adj;

        public Graph(int v) {
            this.v = v;
            adj = new ArrayList<>(v);
            for (int i = 0; i < v; i++) {
                adj.add(new LinkedList<>());
            }
        }

        private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
            if (recStack[i])
                return true;

            if (visited[i]) {
                return false;
            }
            visited[i] = true;
            recStack[i] = true;
            List<Integer> children = adj.get(i);

            for (Integer c : children) {
                if (isCyclicUtil(c, visited, recStack)) {
                    return true;
                }
            }
            recStack[i] = false;

            return false;
        }

        private void addEdge(int source, int dest) {
            adj.get(source).add(dest);
        }

        private boolean isCyclic() {
            boolean[] visited = new boolean[v];
            boolean[] recStack = new boolean[v];

            for (int i = 0; i < v; i++)
                if (isCyclicUtil(i, visited, recStack))
                    return true;

            return false;
        }
    }
}
