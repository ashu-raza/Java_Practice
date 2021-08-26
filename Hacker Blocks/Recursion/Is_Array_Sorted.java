package Recursion;

import java.util.Scanner;

public class Is_Array_Sorted {
	public static boolean isSorted(int[] array, int pointer) {
		//Base Case
		if(pointer == array.length - 1) {
			return true;
		}
		
		if(array[pointer]>array[pointer+1]) {
			return false;
		}
		
		//Recursive Call
		boolean recAns = isSorted(array, pointer+1);
		
		//My Work
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(isSorted(array, 0));
	}

}
