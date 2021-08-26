package Recursion;

import java.util.Scanner;

public class Reverse_An_Array {
	public static void reverseArray(int[] array, int pointer) {
		//Base Case
		if(pointer==array.length) {
			return;
		}
		
		//Recursive Call
		reverseArray(array, pointer+1);
		
		//My Work
		System.out.print(array[pointer] + " ");
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int pointer = 0;
		
		reverseArray(array, pointer);
		return;
	}

}
