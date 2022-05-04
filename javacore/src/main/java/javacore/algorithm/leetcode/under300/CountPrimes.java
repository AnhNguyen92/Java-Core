package javacore.algorithm.leetcode.under300;

/*
 * LeetCode 204
 */
public class CountPrimes {
	public int countPrimes(int n) {
        int count = 0;
        if (n > 2) count = 1;
        for (int i = 3; i < n; i+=2) {  
           if (isPrime(i)) {  
               count++;  
           }
       }
        
        return count;
    }
    
    public boolean isPrime(int n) {  
       // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            if (n % i == 0)
                return false;
        }
        return true;  
   }
}
