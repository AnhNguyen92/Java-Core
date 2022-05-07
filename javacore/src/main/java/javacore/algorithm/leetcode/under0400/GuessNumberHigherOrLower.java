package javacore.algorithm.leetcode.under0400;

/*
 * LeetCode 374
*/
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

//public class GuessNumberHigherOrLower extends GuessGame  {
//	public int guessNumber(int n) {
//        int left = 1;
//        int right = n;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (guess(mid) == -1) {
//                right = mid;
//            } else if (guess(mid) == 1) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return left;
//        
//    }
//}
