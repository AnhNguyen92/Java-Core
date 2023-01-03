package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 797. All Paths From Source to Target

 */
public class AllPathsFromSourceToTarget {
	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		int n = graph.length;
		Graph g = new Graph(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				g.addEdge(i, graph[i][j]);
			}
		}
		g.printAllPaths(0, n - 1);

		return ans;
	}

	public class Graph {
		private int v;
		private ArrayList<Integer>[] adjList;

		public Graph(int vertices) {
			this.v = vertices;
			initAdjList();
		}

		private void initAdjList() {
			adjList = new ArrayList[v];
			for (int i = 0; i < v; i++) {
				adjList[i] = new ArrayList<>();
			}
		}

		public void addEdge(int u, int v) {
			adjList[u].add(v);
		}

		public void printAllPaths(int s, int d) {
			boolean[] isVisited = new boolean[v];
			ArrayList<Integer> pathList = new ArrayList<>();
			pathList.add(s);
			printAllPathsUtil(s, d, isVisited, pathList);
		}

		private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {
			if (u.equals(d)) {
				ans.add(new ArrayList<>(localPathList));
				return;
			}
			isVisited[u] = true;
			for (Integer i : adjList[u]) {
				if (!isVisited[i]) {
					localPathList.add(i);
					printAllPathsUtil(i, d, isVisited, localPathList);
					localPathList.remove(i);
				}
			}
			isVisited[u] = false;
		}
	}
}
