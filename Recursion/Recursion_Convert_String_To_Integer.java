package Recursion;

import java.util.Scanner;

public class Recursion_Convert_String_To_Integer {
	public static void makeInteger(String str, int number, int pointer) {
		//Base Case
		if(pointer == str.length()) {
			System.out.println(number);
			return;
		}
		
		//My Work
		char ch = str.charAt(pointer);
		int digit = ch - 48; //Unicode value of '0' is 48, for '1' is 49, and so on. Implicit type-casting is also taking place from type char to type int
		number = number*10 + digit;

		//Recursive Call
		makeInteger(str, number, pointer+1);
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		makeInteger(str, 0, 0);
	}

}
