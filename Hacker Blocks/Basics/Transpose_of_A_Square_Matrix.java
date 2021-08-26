package Basics;

import java.util.Scanner;

public class Transpose_of_A_Square_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] matrix = new int[N][N];
		
		for(int row = 0; row<N; row++) {
			for(int col = 0; col<N; col++) {
				matrix[row][col] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(j>i) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		for(int row = 0; row<N; row++) {
			for(int col = 0; col<N; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
