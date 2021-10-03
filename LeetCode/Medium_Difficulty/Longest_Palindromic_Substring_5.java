package Medium_Difficulty;

import java.util.Scanner;

public class Longest_Palindromic_Substring_5 {
	public static boolean isPalindromic(String str) {
		int left = 0;
		int right = str.length() - 1;
		
		while(left<right) {
			if(str.charAt(right) == str.charAt(left)) {
				left++;
				right--;
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	
	public static String longestPalindrome(String input) {
        if(input.length() == 1){
        	return input;
        }
        
		String longest = new String("");
        
		for(int leftPointer = 0; leftPointer<input.length(); leftPointer++) {
        	for(int rightPointer = input.length() - 1; rightPointer>=leftPointer; rightPointer--) {
        		String current = input.substring(leftPointer, rightPointer + 1);
        		
        		if(current.length() < longest.length()) {
        			break;
        		}
        		
        		if(isPalindromic(current)) {
        			if(current.length() > longest.length()) {
        				longest = current;
        				break;
        			}
        		}
        	}
        }
		
		return longest;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(longestPalindrome(input));
	}

}
