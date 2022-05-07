package javacore.algorithm.leetcode.under0900;

import java.util.Arrays;

/*
 * LeetCode 896
 */
public class MonotonicArray {
	public boolean isMonotonic(int[] a) {
		int asc = 0;
		int desc = 0;
		boolean notFound = true;
		int i = 0;
		while (i < a.length - 1 && notFound) {
			if (a[i] < a[i + 1])
				asc = 1;
			else if (a[i] > a[i + 1])
				desc = 1;
			if (asc + desc == 2)
				notFound = false;
			i++;
		}

		return (asc + desc != 2);
	}
	
	public boolean isMonotonic2(int[] a) {
        int[] arr = new int[a.length];
        
        System.arraycopy(a, 0, arr, 0, a.length);
        Arrays.sort(arr);
        if (Arrays.equals(a, arr)) return true;
        int[] revertArr = descendingArray(arr);

        return Arrays.equals(a, revertArr);
    }
    
    private int[] descendingArray(int[] array) {
    int[] descArray = new int[array.length];
    for(int i=0; i<array.length; i++) {
        descArray[i] = array[(array.length-1)-i];
    }
    return descArray;
}
}
