package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;

/**
 * 1352. Product of the Last K Numbers
 */
public class ProductOfTheLastKNumbers {
    class ProductOfNumbers {
        List<Integer> lst;
        int size;
        public ProductOfNumbers() {
            lst = new ArrayList<>();
            size = 0;
        }

        public void add(int num) {
            if (num == 0) {
                lst = new ArrayList<>();
                size = 0;
            } else if (lst.isEmpty()) {
                lst.add(num);
                size++;
            } else {
                lst.add(lst.get(size - 1) * num);
                size++;
            }
        }

        public int getProduct(int k) {
            if (k > size) {
                return 0;
            }
            if (k == size) {
                return lst.get(size - 1);
            }
            return lst.get(size - 1) / lst.get(size - 1 - k);
        }
    }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
}
