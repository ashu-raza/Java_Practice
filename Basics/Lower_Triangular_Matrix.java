package Basics;
import java.util.Scanner;

public class Lower_Triangular_Matrix {

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
			for(int j = i+1; j<N; j++) {
				if(matrix[i][j] != 0) {
					System.out.println(false);
					return;
				}
			}
		}

		System.out.println(true);
	}

}
