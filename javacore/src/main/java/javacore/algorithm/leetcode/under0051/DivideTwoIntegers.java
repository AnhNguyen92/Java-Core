package javacore.algorithm.leetcode.under0051;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivideTwoIntegers {
    private static final Logger logger = LoggerFactory.getLogger(DivideTwoIntegers.class);
    
    public static void main(String[] args) {
        int dividend = Integer.MIN_VALUE;
        int divisor = -1;
        logger.info("result = {}", divide(dividend, divisor));
    }
    
    public static int divide(int dividend, int divisor) {
        long absA = Math.abs((long) dividend);
        long absB = Math.abs((long) divisor);

        long result = absA / absB;
        
        result = (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) ? result : -result;
        
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        }
        return (int) result;
    }
    
}
