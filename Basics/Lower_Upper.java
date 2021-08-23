package Basics;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		
		if(input >='a' && input <='z') {
			System.out.println("lowercase");
		} else if (input >='A' && input <='Z'){
			System.out.println("UPPERCASE");
		} else {
			System.out.println("Invalid");
		}
	}

}
