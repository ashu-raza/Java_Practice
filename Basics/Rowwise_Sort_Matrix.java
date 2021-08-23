package Basics;
import java.util.Scanner;

public class Rowwise_Sort_Matrix {
	public static void sort1DArray(int[] arrayRef, int N) {
		
		for(int pointer = 0; pointer<N; pointer++) {
			int minValue = Integer.MAX_VALUE;
			int minIndex = -1;
			//searching minimum value
			for(int i = pointer; i<N; i++) {
				if(arrayRef[i]<minValue) {
					minValue = arrayRef[i];
					minIndex = i;
				}
			}
			//swapping
			int temp = arrayRef[pointer];
			arrayRef[pointer] = arrayRef[minIndex];
			arrayRef[minIndex] = temp;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] matrix = new int[M][N];
		
		for(int row = 0; row<M; row++) {
			for(int col = 0; col<N; col++) {
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for(int i=0; i<M; i++) {
			sort1DArray(matrix[i], N);
		}
		
		for(int row = 0; row<M; row++) {
			for(int col = 0; col<N; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
