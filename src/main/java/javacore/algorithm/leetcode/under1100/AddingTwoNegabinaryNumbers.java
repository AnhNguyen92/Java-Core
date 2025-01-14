package javacore.algorithm.leetcode.under1100;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 1073. Adding Two Negabinary Numbers
 */
public class AddingTwoNegabinaryNumbers {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        BigInteger a = convertToBaseMinus2(arr1);
        BigInteger b = convertToBaseMinus2(arr2);
        BigInteger sum = a.add(b);
        return convertToBinaryArrayBaseMinus2(sum);
    }

    public BigInteger convertToBaseMinus2(int[] arr) {
        BigInteger result = BigInteger.ZERO;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                int bit = arr[i];
                BigInteger power = BigInteger.valueOf(-2).pow(n - 1 - i);
                result = result.add(BigInteger.valueOf(bit).multiply(power));
            }
        }

        return result;
    }

    public int[] convertToBinaryArrayBaseMinus2(BigInteger number) {
        if (number.equals(BigInteger.ZERO)) {
            return new int[] { 0 };
        }
        List<Integer> binaryList = new ArrayList<>();

        while (!number.equals(BigInteger.ZERO)) {
            BigInteger[] divRem = number.divideAndRemainder(BigInteger.valueOf(-2));
            BigInteger quotient = divRem[0];
            BigInteger remainder = divRem[1];

            if (remainder.signum() == -1) {
                remainder = remainder.add(BigInteger.valueOf(2));
                quotient = quotient.add(BigInteger.ONE);
            }
            binaryList.add(remainder.intValue());
            number = quotient;
        }

        int[] binaryArray = new int[binaryList.size()];
        for (int i = 0; i < binaryList.size(); i++) {
            binaryArray[i] = binaryList.get(binaryList.size() - 1 - i);
        }

        return binaryArray;
    }
}
