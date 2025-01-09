package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.List;

/**
 * 684. Redundant Connection
 */
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges.length + 1);
        List<int[]> lst = new ArrayList<>();
        for (int[] arr : edges) {
            if (uf.connected(arr[0], arr[1]))
                lst.add(arr);
            else
                uf.union(arr[0], arr[1]);
        }

        return lst.get(lst.size() - 1);
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

        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
