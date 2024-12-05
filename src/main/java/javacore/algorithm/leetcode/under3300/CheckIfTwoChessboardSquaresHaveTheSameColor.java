package javacore.algorithm.leetcode.under3300;

/*
 * 3274. Check if Two Chessboard Squares Have the Same Color
 * */
public class CheckIfTwoChessboardSquaresHaveTheSameColor {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a = coordinate1.charAt(0);
        char x = coordinate1.charAt(1);
        char b = coordinate2.charAt(0);
        char y = coordinate2.charAt(1);
        int s = Math.abs(x - y);
        return (Math.abs(a - b) % 2) == (s % 2);
    }
}
