package javacore.algorithm.leetcode.under1000;

/**
 * 904. Fruit Into Baskets
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int ans = 0;
        int a = -1;
        int b = fruits[0];
        int pos1 = -1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != a && fruits[i] != b) {
                ans = Math.max(ans, count);
                count = i - pos1;
                a = b;
                b = fruits[i];
            } else {
                count++;
                if (fruits[i] == a) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
            }
            if (i > 0 && fruits[i] != fruits[i - 1]) {
                pos1 = i - 1;
            }
        }
        return Math.max(ans, count);
    }
}
