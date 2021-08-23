package Basics;
import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] matrix = new int[M][N];
		
		for(int row = 0; row<M; row++) {
			for(int col = 0; col<N; col++) {
				matrix[row][col] =sc.nextInt();
			}
		}
		
		int leftCol = 0;     //first, traverse down through this column
		int bottomRow = M-1; //secondly, traverse right through this row
		int rightCol = N-1;  //thirdly, traverse up through this column
		int topRow = 0;      //finally, traverse left through this row
		
		int digits = 0;
		while(true) {
//			traversing down through the left column
			for(int i = topRow; i<=bottomRow; i++) {
				System.out.print(matrix[i][leftCol] + ", ");
				digits++;
				if(digits==M*N) {
					System.out.print("END");
					return;
				}
			}
			leftCol++;

//			traversing right through the bottom row
			for(int i = leftCol; i<=rightCol; i++) {
				System.out.print(matrix[bottomRow][i] + ", ");
				digits++;
				if(digits==M*N) {
					System.out.print("END");
					return;
				}
			}
			bottomRow--;
			
//			traversing up through the right column
			for(int i = bottomRow; i>=topRow; i--) {
				System.out.print(matrix[i][rightCol] + ", ");
				digits++;
				if(digits==M*N) {
					System.out.print("END");
					return;
				}
			}
			rightCol--;
			
//			traversing left through the top row
			for(int i = rightCol; i>=leftCol; i--) {
				System.out.print(matrix[topRow][i] + ", ");
				digits++;
				if(digits==M*N) {
					System.out.print("END");
					return;
				}
			}
			topRow++;
			
		}	

	}

}
