package javacore.algorithm.leetcode.under1900;

/**
 * 1861. Rotating the Box
 */
public class RotatingTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] ans = new char[n][m];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (box[i][j] == '.') {
                    for (int k = j - 1; k >= 0; k--) {
                        if (box[i][k] == '*')
                            break;
                        if (box[i][k] == '#') {
                            box[i][j] = '#';
                            box[i][k] = '.';
                            break;
                        }
                    }
                }
                ans[j][m - 1 - i] = box[i][j];
            }
        }
        return ans;
    }
}
