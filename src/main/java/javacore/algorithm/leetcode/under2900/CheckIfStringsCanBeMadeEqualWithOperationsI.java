package javacore.algorithm.leetcode.under2900;

/**
 * 2839. Check if Strings Can be Made Equal With Operations I
 */
public class CheckIfStringsCanBeMadeEqualWithOperationsI {
    public boolean canBeEqual(String s1, String s2) {
        if ( (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2))
                ||  (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0)) ) {
            return (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1))
                    ||  (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3));
        }
        return false;
    }
}
