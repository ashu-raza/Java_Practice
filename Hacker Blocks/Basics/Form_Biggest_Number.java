package Basics;

import java.util.Scanner;

public class Form_Biggest_Number {
	
	public static boolean isBetter(String currentString, String referenceString) {
		int smallerLength = Math.min(currentString.length(), referenceString.length());
		
		for(int i = 0; i<smallerLength; i++) {
			int digit1 = currentString.charAt(i);
			int digit2 = referenceString.charAt(i);
			
			if(digit1>digit2) {
				return true;
			}else if(digit1<digit2){
				return false;
			}else {
				continue;
			}
		}
		
		String firstChoice = currentString + referenceString;
		String secondChoice = referenceString + currentString;
		
		return isBetter(firstChoice, secondChoice);
	}
	
	public static void rearrange(int[] input) {
		
		for(int pointedIndex = 0; pointedIndex<=input.length - 2; pointedIndex++) {
			int selectedNumber = input[pointedIndex];
			int correspondingIndex = pointedIndex;
			
			for(int currentIndex = pointedIndex + 1; currentIndex<=input.length - 1; currentIndex++) {
				int currentNumber = input[currentIndex];
				if(currentNumber != selectedNumber) {
					if(isBetter(currentNumber+"", selectedNumber+"") == true) {
						selectedNumber = currentNumber;
						correspondingIndex = currentIndex;
					}
				}
			}
			
			input[correspondingIndex] = input[pointedIndex];
			input[pointedIndex] = selectedNumber;
		}
		
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			int N = sc.nextInt();
			
			int[] array = new int[N];
			
			for(int i = 0; i<N; i++) {
				array[i] = sc.nextInt();
			}
			
			rearrange(array);
			
			for(int i = 0; i<array.length; i++) {
				System.out.print(array[i]);
			}
			System.out.println();
			
			T--;
		}
	}
}
