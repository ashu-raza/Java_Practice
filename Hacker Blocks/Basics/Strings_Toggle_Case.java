package Basics;

import java.util.Scanner;

public class Strings_Toggle_Case {
	public static char toggleCase(char c){
		int oldCode = c;
		int newCode;
		
		if(oldCode>=65 && oldCode<=90) { //Upper Case
			newCode = 97 + (oldCode - 65);
		}else { //Lower Case
			newCode = 65 + (oldCode - 97); 
		}
		
		return (char)newCode;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i = 0; i<str.length(); i++) {
			System.out.print(toggleCase(str.charAt(i)));
		}
	}
}
