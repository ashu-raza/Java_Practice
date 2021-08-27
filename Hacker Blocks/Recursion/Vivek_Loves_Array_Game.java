package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class Vivek_Loves_Array_Game {
	public static int genSplitPointer(int[] input) {
		if(input.length == 1) {
			return -1;
		}
		
		int currentPointer;
		for(currentPointer = 0; currentPointer<=input.length-2; currentPointer++) {
			//Calculate the sum of provided array's left part assuming a hypothetical split at index = current pointer
			int sumLeft = 0;
			for(int i = 0; i<=currentPointer; i++) {
				sumLeft = sumLeft + input[i];
			}

			//Calculate the sum of provided array's right part assuming a hypothetical split at index = current pointer
			int sumRight = 0;
			for(int i = currentPointer+1; i<=input.length-1; i++) {
				sumRight = sumRight + input[i];
			}
			
			if(sumLeft == sumRight) {
				return currentPointer;
			}	
		}

		return -1;
	}
	
	public static int vivekChance(int[] input, int splitPointer) {
		if(splitPointer == -1) {
			return 0;
		}
		
		int thisMovePoints = 1;
		
		//GENERATE THE LEFT-PART ARRAY RESULTING FROM THE SPLIT
		int[] leftPartOnly = new int[splitPointer+1];
		for(int i = 0; i<leftPartOnly.length; i++) {
			leftPartOnly[i] = input[i];
		}
		
		//GENERATE THE RIGHT-PART ARRAY RESULTING FROM THE SPLIT
		int[] rightPartOnly = new int[input.length - leftPartOnly.length];
		for(int i = 0; i<rightPartOnly.length; i++) {
			rightPartOnly[i] = input[(splitPointer+1) + i];
		}
			
		int leftChoicePoints = vivekChance(leftPartOnly, genSplitPointer(leftPartOnly));
		int rightChoicePoints = vivekChance(rightPartOnly, genSplitPointer(rightPartOnly));

		if(leftChoicePoints>=rightChoicePoints) {
			return thisMovePoints + leftChoicePoints;
		}else {
			return thisMovePoints + rightChoicePoints;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			int N = sc.nextInt();
			
			int[] A = new int[N];
			for(int i = 0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			int finalAnswer = vivekChance(A, genSplitPointer(A));
			System.out.println(finalAnswer);	
			T--;
		}
	}
}
