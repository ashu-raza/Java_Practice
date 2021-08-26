package Basics;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		String output = new String();
				
		for(int i = 0; i<input.length(); i++) {			
			char ch = input.charAt(i);
			
			if(i%2 == 0) {
				ch++;
			}else {
				ch--;
			}
			
			output = output.concat("" + ch);
		}
		
		System.out.println(output);
	}

}
