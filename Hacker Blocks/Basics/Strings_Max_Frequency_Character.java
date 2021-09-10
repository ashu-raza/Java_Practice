package Basics;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {
	static int[] alphabets;
	
	public static void main(String[] args) {
		alphabets = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		for(int i = 0; i<input.length(); i++) {
			int curr = input.charAt(i);
			alphabets[curr - 97]++; 
		}
		
		int maxOccr = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int i = 0; i<26; i++) {
			if(alphabets[i]>maxOccr) {
				maxOccr = alphabets[i];
				maxIndex = i;
			}
		}
		
		maxIndex += 97; 
		System.out.println((char)maxIndex);
	}

}
