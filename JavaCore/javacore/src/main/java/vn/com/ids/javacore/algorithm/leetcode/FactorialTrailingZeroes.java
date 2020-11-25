package vn.com.ids.javacore.algorithm.leetcode;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 200;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int countFive = n / 5;
        int temp;
        for (int i = 25; i <= n; i+= 25) {
            countFive++;
            temp = i /25;
            while (temp % 5 == 0) {
                countFive++;
                temp /=5;
            } 
        }
        return countFive;
    }
}
