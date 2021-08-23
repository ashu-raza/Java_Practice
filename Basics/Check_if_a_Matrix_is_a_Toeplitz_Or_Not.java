package Basics;
import java.util.Scanner;

public class Check_if_a_Matrix_is_a_Toeplitz_Or_Not {

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
		
		boolean answer = true;
		
		//Indices of the element at top-right corner
		int rowPointer = 0; 
		int colPointer = N-1;
		
		while(rowPointer<M) {
			//traversing and verifying diagonally
			int i = 1;
			while(true) {
				int row = rowPointer+i;
				int col = colPointer+i;
				
				if(row>=M || col>=N) {
					break;
				}
				
				if(matrix[row][col] != matrix[rowPointer][colPointer]){
					System.out.println(false);
					return;
				}
				
				i++;
			}
			
			if(colPointer == 0) {
				rowPointer++;
			}else {
				colPointer--;
			}
		}
		
		System.out.println(true);
	}

}
