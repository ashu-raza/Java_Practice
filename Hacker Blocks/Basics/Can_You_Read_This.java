package Basics;

import java.util.Scanner;

public class Can_You_Read_This {
	public static boolean isUpperCase(char x) {
		if(x>=97 && x<=122) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();

		int startPointer = 0;
		int endPointer = 0;
		
		for(int i = 0; i<input.length(); i++) {
			if(isUpperCase(input.charAt(i)) == true) {
				endPointer = i;
				String output = input.substring(startPointer, endPointer);
				if(output.length()>0) {
					System.out.println(output);
				}
				startPointer = i;
			}
		}
		
		endPointer = input.length();
		System.out.println(input.substring(startPointer, endPointer));
	}
}
