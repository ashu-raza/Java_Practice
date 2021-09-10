package Basics;

import java.util.Scanner;

public class Strings_Is_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				System.out.println(false);
				return;
			}
			
			left++;
			right--;
		}
		
		System.out.println(true);
	}

}
