package Basics;

import java.util.Scanner;

public class Arrays_Max_Value_In_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		int maxValue = Integer.MIN_VALUE;
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
			if(array[i]>maxValue) {
				maxValue = array[i];
			}
		}
		
		System.out.println(maxValue);
	}

}
