package Recursion;

import java.util.Scanner;

public class Mazepath_D2_Count_Print {
	static int N;
	
	public static int performMove(int currRow, int currCol, String path) {
		if(currRow>N || currCol>N) {
			return 0;
		}
		
		if(currRow == N && currCol == N) {
			System.out.print(path + " ");
			return 1;
		}
		
		int recAns = 0;
		
		recAns = recAns + performMove(currRow + 1, currCol, path + "V");
		recAns = recAns + performMove(currRow, currCol + 1, path + "H");
		if(currRow == currCol || currRow + currCol == N+1) {
			recAns = recAns + performMove(currRow + 1, currCol + 1, path + "D");
		}
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		int ans = performMove(1,1,"");
		System.out.println();
		System.out.println(ans);
	}
}
