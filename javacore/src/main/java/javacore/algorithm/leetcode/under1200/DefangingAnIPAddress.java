package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1108
 */
public class DefangingAnIPAddress {
	public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
