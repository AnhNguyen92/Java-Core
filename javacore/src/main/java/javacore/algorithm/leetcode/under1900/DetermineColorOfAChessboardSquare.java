package javacore.algorithm.leetcode.under1900;

/*
 * Leetcode 1812
 */
public class DetermineColorOfAChessboardSquare {
	public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a';
        int rol = Character.getNumericValue(coordinates.charAt(1));
        return (rol + col) % 2 == 0;
    }
}
