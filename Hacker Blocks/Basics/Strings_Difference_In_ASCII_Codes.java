package Basics;

import java.util.Scanner;

public class Strings_Difference_In_ASCII_Codes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int prev = str.charAt(0);
		
		System.out.print((char)prev);
		for(int i = 1; i<str.length(); i++) {
			int curr = str.charAt(i);
			int diff = curr - prev;
			System.out.print(diff);
			System.out.print((char)curr);
			//For next iteration:
			prev = curr;
		}
	}

}
