package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 762. Prime Number of Set Bits in Binary Representation
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
	public int countPrimeSetBits(int L, int R) {
		int count = 0;
		for (int i = L; i <= R; i++) {
			int bitCount = Integer.bitCount(i);
			if (isValidPrime(bitCount)) {
				count++;
			}
		}
		return count;
	}
    
    private boolean isValidPrime(int prime) {
        return prime == 2 || prime == 3
                || prime == 5 || prime == 7
                || prime == 11 || prime == 13
                || prime == 17 || prime == 19;
    }
}
