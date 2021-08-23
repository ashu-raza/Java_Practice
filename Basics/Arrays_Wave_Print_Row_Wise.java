package Basics;
import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

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
		
		int rowNo = 0;
		while(rowNo<M) {
			//even row
			if(rowNo%2 == 0) {
				for(int i = 0; i<N; i++) {
					System.out.print(matrix[rowNo][i] + ", ");
				}
			}
			
			//odd row
			else{
				for(int i = N-1; i>=0; i--) {
					System.out.print(matrix[rowNo][i] + ", ");
				}
			}
			
			rowNo++;
		}
		
		System.out.println("END");
	}

}
