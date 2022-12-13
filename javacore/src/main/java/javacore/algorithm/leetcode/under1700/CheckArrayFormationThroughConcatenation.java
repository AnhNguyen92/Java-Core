package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1640. Check Array Formation Through Concatenation
 */
public class CheckArrayFormationThroughConcatenation {
	public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] indexs = new int[102];
        for(int i = 0; i < arr.length; ++i) {
            indexs[arr[i]] = i + 1;
        }
        for(int[] ps : pieces) {
            if(indexs[ps[0]] == 0) return false;
            for(int i = 1; i < ps.length; ++i) {
                if(indexs[ps[i]] - indexs[ps[i - 1]] != 1)
                    return false;
            }
        }
        return true;
    }
}
