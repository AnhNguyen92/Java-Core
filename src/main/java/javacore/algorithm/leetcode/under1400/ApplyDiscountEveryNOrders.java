package javacore.algorithm.leetcode.under1400;

import java.util.HashMap;
import java.util.Map;

/**
 * 1357. Apply Discount Every n Orders
 */
public class ApplyDiscountEveryNOrders {
    class Cashier {
        Map<Integer, Integer> priceMap = new HashMap<>();
        int target;
        int total;
        double discount;

        public Cashier(int n, int discount, int[] products, int[] prices) {
            total = 0;
            this.discount = 1.0 * (100 - discount) / 100;
            target = n;
            for (int i = 0; i < products.length; i++) {
                priceMap.put(products[i], prices[i]);
            }
        }

        public double getBill(int[] products, int[] amount) {
            double price = 0.0;
            for (int i = 0; i < products.length; i++) {
                price += 1.0 * priceMap.get(products[i]) * amount[i];
            }
            total++;
            if (total == target) {
                total = 0;
                price *= discount;
            }
            return price;
        }
    }
}
