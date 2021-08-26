package Basics;
import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {

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
				if(j<i) {
					matrix[i][j] = 0;
					continue;
				}
				if(j==i) {
					break;
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
