package Recursion;

import java.util.Scanner;

public class First_Index {
	public static int searchFor(int M, int[] array, int pointer) {
		//Base Case
		if(pointer == array.length) {
			return -1;
		}
		if(array[pointer] == M) {
			return pointer;
		}
		
		//My Work and then Recursive Call
		int recAns = searchFor(M, array, pointer+1);
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int array[] = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		System.out.println(searchFor(M, array, 0));
		return;
	}

}
