package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_Codes_of_The_string {
	public static ArrayList<String> decodeString(String input, String output){
		//BASE CASE
		if(input.length() == 0) {
			ArrayList<String> baseAns = new ArrayList<>(1);
			baseAns.add(output);
			return baseAns;
		}
		
		ArrayList<String> recAns = new ArrayList<>();

		//CHOICE A: choose only the first character of the input string. 
		char alphabet1 = (char)(input.charAt(0) + 48);
		recAns.addAll(decodeString(input.substring(1), output + alphabet1));
		
		//CHOICE B: choose the first two characters of the input string, provided that the input string has at least 2 characters.
		if(input.length() >= 2) {
			char[] temp = input.substring(0,2).toCharArray();
			int a = temp[0] - 48;
			int b = temp[1] - 48;
			int c = 10*a + b;
			if(c>=1 && c<=26) {
				char alphabet2 = (char)((48+c) + 48);
				recAns.addAll(decodeString(input.substring(2), output + alphabet2));
			}
		}
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		ArrayList<String> finalAns = decodeString(str,"");
		System.out.println(finalAns);
	}
}
