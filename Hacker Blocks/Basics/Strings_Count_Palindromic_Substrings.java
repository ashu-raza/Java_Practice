package Basics;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
	public static boolean isPalindromic(String str) {
		int leftPointer = 0;
		int rightPointer = str.length()-1;
		
		while(leftPointer<rightPointer) {
			if(str.charAt(leftPointer) != str.charAt(rightPointer)) {
				return false;
			}
			
			leftPointer++;
			rightPointer--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int count = 0;
		for(int i = 0; i<input.length(); i++) {
			for(int j = i; j<input.length(); j++) {
				String str = input.substring(i,j+1);
				
				if(isPalindromic(str)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
