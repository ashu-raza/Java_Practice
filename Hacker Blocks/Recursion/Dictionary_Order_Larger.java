package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Larger {
	static String originalString;
	static boolean beginAppending = false;
	
	public static String rearrange(String input) {
		if(input.length() <= 1) {
			return input;
		}
		
		char[] characters = input.toCharArray();
		
		int[] asciiValues = new int[characters.length];
		
		for(int i = 0; i<asciiValues.length; i++) {
			asciiValues[i] = characters[i];
		}
		
		Arrays.sort(asciiValues);
		
		String output = "";
		
		for(int i = 0; i<asciiValues.length; i++) {
			output = output + (char)asciiValues[i];
		}
		
		return output;
	}
	
	public static ArrayList<String> genLexicographicallyHigherPermutations(String input, String output, boolean[] flagOfChar, int totalFlagged){
		//Negative Base Case
		if(input.length() <= 1) {
			ArrayList<String> baseAns = new ArrayList<>(1);
			return baseAns; //Zero-sized or empty Array List
		}
		
		//Base Case 
		if(totalFlagged == input.length()) {
			 ArrayList<String> baseAns = new ArrayList<>(1);
			 if(beginAppending == true) {
				 baseAns.add(output);
			 }
			 if(output.equals(originalString) == true) {
				 beginAppending = true;
			 }
			 return baseAns;
		}

		ArrayList<String> recAns = new ArrayList<>(); 
		for(int i = 0; i<input.length(); i++) {
			if(flagOfChar[i] == false) {
				flagOfChar[i] = true; //flagging this character
				recAns.addAll(genLexicographicallyHigherPermutations(input, output + input.charAt(i), flagOfChar, totalFlagged + 1));
				flagOfChar[i] = false; //backtracking
			}
		}
		 
		return recAns; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		originalString = sc.next();
		String inputString = rearrange(originalString);
		
		boolean[] initialFlags = new boolean[inputString.length()];
		
		ArrayList<String> finalAns = new ArrayList<>(); 
		finalAns = genLexicographicallyHigherPermutations(inputString, "", initialFlags, 0);
		
		for(String str: finalAns) {
			System.out.println(str);
		}
	}
}
