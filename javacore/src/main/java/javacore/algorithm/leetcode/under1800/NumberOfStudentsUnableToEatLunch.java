package javacore.algorithm.leetcode.under1800;

/*
 * LeetCode 1700
 */
public class NumberOfStudentsUnableToEatLunch {
	public int countStudents(int[] students, int[] sandwiches) {
        int sandwichPointer = 0;
        int[] studentCounts = new int[2];
        for (int i : students) {
            ++studentCounts[i];
        }
        while (sandwichPointer < sandwiches.length) {
            if (sandwiches[sandwichPointer] == 0) {
                if (studentCounts[0] > 0) {
                    --studentCounts[0];
                } else {
                    break;
                }
            } else {
                if (studentCounts[1] > 0) {
                    --studentCounts[1];
                } else {
                    break;
                }
            }
            ++sandwichPointer;
        }
        return studentCounts[0] + studentCounts[1];
    }
}