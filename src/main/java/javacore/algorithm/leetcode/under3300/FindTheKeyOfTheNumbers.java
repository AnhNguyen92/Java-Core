package javacore.algorithm.leetcode.under3300;

/*
 * 3270. Find the Key of the Numbers
 * */
public class FindTheKeyOfTheNumbers {
    public int generateKey(int num1, int num2, int num3) {
        int a = min(num1 % 10, min(num2 % 10, num3 % 10));
        num1 /= 10;
        num2 /= 10;
        num3 /= 10;
        a += 10 * min(num1 % 10, min(num2 % 10, num3 % 10));
        num1 /= 10;
        num2 /= 10;
        num3 /= 10;
        a += 100 * min(num1 % 10, min(num2 % 10, num3 % 10));
        num1 /= 10;
        num2 /= 10;
        num3 /= 10;
        a += 1000 * min(num1, min(num2, num3));

        return a;
    }

    private int min(int a, int b) {
        return (a < b) ? a : b;
    }

}
