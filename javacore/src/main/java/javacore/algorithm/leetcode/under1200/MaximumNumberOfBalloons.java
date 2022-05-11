package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1189
 */
public class MaximumNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		int b = 0;
		int a = 0;
		int l = 0;
		int o = 0;
		int n = 0;
		for (char c : text.toCharArray()) {
			switch (c) {
			case 'b':
				b++;
				break;
			case 'a':
				a++;
				break;
			case 'l':
				l++;
				break;
			case 'o':
				o++;
				break;
			case 'n':
				n++;
				break;
			}
		}

		int counter = 0;
		int times = text.length() / 7;
		for (int i = 0; i < times; i++) {
			if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
				b -= 1;
				a -= 1;
				l -= 2;
				o -= 2;
				n -= 1;
				counter++;
			} else {
				break;
			}
		}
		return counter;
	}
	
	public int maxNumberOfBalloons2(String text) {
        int[] arr = new int[5];
         for (char c : text.toCharArray()) {
             if (c == 'b') {
                 arr[0]++;
             } else if (c == 'a') {
                 arr[1]++;
             } else if (c == 'l') {
                 arr[2]++;
             } else if (c == 'o') {
                 arr[3]++;
             } else if (c == 'n') {
                 arr[4]++;
             }
         }
        return Math.min(arr[0], Math.min(arr[1], Math.min(arr[2]/2, Math.min(arr[3]/2, arr[4]))));
    }
}
