package javacore.algorithm.leetcode.under2300;

/**
 * 2288. Apply Discount to Prices
 */
public class ApplyDiscountToPrices {
    public String discountPrices(String sentence, int discount) {
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        double percent = 1.0 * (100 - discount) / 100.0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith("$") && isValidNumber(arr[i])) {
                long x = Long.parseLong(arr[i].substring(1));
                double val = x * percent;
                sb.append("$").append(String.format("%.2f", val));
            } else {
                sb.append(arr[i]);
            }
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private boolean isValidNumber(String s) {
        if (s.length() <= 1)
            return false;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
