package vn.com.ids.javacore.algorithm;

public class LeetCode13 {
	public static void main(String[] args) {
		String s = "III";
		int sum = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
			sum += charToInt(s.charAt(i));
            
            if ((i < s.length() - 1) && (s.charAt(i - 1))) {
            	
            }
                
            sum += temp;
            temp =0;
            
		}
	}
	
	private static int charToInt(char c) {
        int result = 0;
        switch (c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            default:
                result = 1000;
                break;
        }
        
        return result;
    }
	
}
