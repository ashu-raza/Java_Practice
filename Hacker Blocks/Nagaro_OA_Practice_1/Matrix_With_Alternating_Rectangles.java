package Nagaro_OA_Practice_1;

import java.util.Scanner;

public class Matrix_With_Alternating_Rectangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] matrix = new int[M][N];
		
		int startRow = 0;
		int endRow = M;
		int startCol = 0;
		int endCol = N;
		
		char icon = '0';
		while() {
			if(icon == '0') {
				icon = 'X';
			}else {
				icon = '0';
			}
			
			for(int i = startCol; i<endCol; i++) {
				System.out.println(icon);
			}
			startRow++;
			
			for(int i = startRow; i<endRow; i++) {
				System.out.println(icon);
			}
			startRow++;
			
		}
		

	}

}
