package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1361. Validate Binary Tree Nodes
 */
public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Map<Integer, Integer> map = new HashMap<>();
        UnionFind uf = new UnionFind(n+1);
        for (int i = 0; i < leftChild.length; i++) {
            if (leftChild[i] >= 0) {
                if (map.get(leftChild[i]) != null)
                    return false;
                map.put(leftChild[i], i);
                uf.union(i, leftChild[i]);
            }
            if (rightChild[i] >= 0) {
                if (map.get(rightChild[i]) != null) {
                    return false;
                }
                map.put(rightChild[i], i);
                uf.union(i, rightChild[i]);
            }
        }
        if(map.size() != n-1)
            return false;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(uf.find(i));
        }

        return set.size() == 1;
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;
        UnionFind uf = new UnionFind(n+1);
        for (int[] arr : connections) {
            uf.union(arr[1], arr[0]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(uf.find(i));
        }

        return set.size() - 1;
    }

    public class UnionFind {
        private int[] parent;
        private int[] rank;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];

            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) return;

            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }

    }
}
