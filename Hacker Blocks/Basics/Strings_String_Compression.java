package Basics;

import java.util.Scanner;

public class Strings_String_Compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char currChar = str.charAt(0);
		int currCharCount = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == currChar) {
				currCharCount++;
			}else {
				System.out.print(currChar);
				if(currCharCount>1) {
					System.out.print(currCharCount);
				}				
				currChar = str.charAt(i);
				currCharCount = 1;
			}
		}
		
		System.out.print(currChar);
		if(currCharCount>1) {
			System.out.print(currCharCount);
		}
	}

}
