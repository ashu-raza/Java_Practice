package Basics;
import java.util.Scanner;

public class Rotate_Image {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] matrix = new int[N][N];
		
		for(int row = 0; row<N; row++) {
			for(int col = 0; col<N; col++) {
				matrix[row][col] = sc.nextInt();
			}
		}
		
		int[][] newMatrix = new int[N][N];
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				newMatrix[(N-1)-j][i] = matrix[i][j];
			}
		}
		
		for(int row = 0; row<N; row++) {
			for(int col = 0; col<N; col++) {
				System.out.print(newMatrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
