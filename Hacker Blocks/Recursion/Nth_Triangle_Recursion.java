package Recursion;

import java.util.Scanner;

public class Nth_Triangle_Recursion {
	public static void findSum(int N, int sum) {
		//Base Case
		if(N == 0) {
			System.out.println(sum);
			return;
		}
		
		//My Work
		sum = sum + N;
		
		//Recursive Call
		findSum(N-1,sum);
		
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		findSum(N,0);
		
		return;
	}

}
