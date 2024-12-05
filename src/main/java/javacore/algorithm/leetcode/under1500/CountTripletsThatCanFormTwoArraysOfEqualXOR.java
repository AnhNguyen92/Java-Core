package javacore.algorithm.leetcode.under1500;

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
    public int countTriplets(int[] arr) {
        int count = 0;
        int a;
        for (int i = 0; i < arr.length; i++) {
            a = 1;
            for (int j = i; j < arr.length; j++) {
                a ^= arr[j];
                int b = 1;
                for (int k = j + 1; k < arr.length; k++) {
                    b ^= arr[k];
                    if (a == b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
