package javacore.algorithm.leetcode.under0500;

/**
 * 427. Construct Quad Tree
 */
public class ConstructQuadTree {
    public Node construct(int[][] grid) {
        boolean isLeaf = true;
        int n = grid.length;
        for (int[] row : grid) {
            for (int j = 0; j < n; j++) {
                if (row[j] != grid[0][0]) {
                    isLeaf = false;
                    break;
                }
            }
        }
        if (isLeaf) {
            return new Node(grid[0][0] == 1, true);
        }
        int x = n / 2;
        int[][] ar1 = new int[x][x];
        int[][] ar2 = new int[x][x];
        int[][] ar3 = new int[x][x];
        int[][] ar4 = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                ar1[i][j] = grid[i][j];
                ar2[i][j] = grid[i][j + x];
                ar3[i][j] = grid[i + x][j];
                ar4[i][j] = grid[i + x][j + x];
            }
        }
        return new Node(true, false, construct(ar1), construct(ar2), construct(ar3), construct(ar4));
    }

    /*
    // Definition for a QuadTree node.
     */
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

}
