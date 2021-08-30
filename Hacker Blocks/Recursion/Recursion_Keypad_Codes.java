package Recursion;

import java.util.Scanner;

public class Recursion_Keypad_Codes {
	public static String genCorrespondingString(char c) {
		switch(c) {
			case '1':
				return "abc";
			case '2':
				return "def";
			case '3':
				return "ghi";
			case '4':
				return "jkl";
			case '5':
				return "mno";
			case '6':
				return "pqrs";
			case '7':
				return "tuv";
			case '8':
				return "wx";
			case '9':
				return "yz";
			default:
				return "";
		}
	}
	
	public static int genWords(String input, String output) {
		if(input.length() == 0) {
			System.out.print(output + " ");
			return 1;
		}
		
		String correspondingString = genCorrespondingString(input.charAt(0));
		
		int recAns = 0;
		for(int i = 0; i<correspondingString.length(); i++) {
			recAns += genWords(input.substring(1), output + correspondingString.charAt(i));
		}
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int ans = genWords(str, "");
		System.out.println();
		System.out.println(ans);
	}
}
