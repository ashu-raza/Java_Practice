package Basics;
import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int index = 1; index<N; index++) {
			int numberPointer = index;
			int comparisonPointer = index-1;

			do {
				if(array[numberPointer] < array[comparisonPointer]) {
					//swapping
					int temp = array[numberPointer];
					array[numberPointer] = array[comparisonPointer]; 
					array[comparisonPointer] = temp;
					
					numberPointer = comparisonPointer;
				}
				
				comparisonPointer--;
			}while(comparisonPointer>=0);
			
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
