package Basics;
import java.util.Scanner;

public class Arrays_Wave_Print_Column_Wise {

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
		int colNo = 0;
		
		for(int i = 0; i<N; i++) {
			if(i%2 == 0) {
				for(int j = 0; j<M; j++) {
					System.out.print(matrix[j][i] + ", ");
				}
			}else {
				for(int j = M-1; j>=0; j--) {
					System.out.print(matrix[j][i] + ", ");
				}
			}
		}
		
		System.out.print("END");
	}

}
