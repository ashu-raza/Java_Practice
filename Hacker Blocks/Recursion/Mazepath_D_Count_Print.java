package Recursion;

import java.util.Scanner;

public class Mazepath_D_Count_Print {
	static int N1;
	static int N2;
	
	public static int performMove(int currRow, int currCol, String path) {
		if(currRow>N1 || currCol>N2) {
			return 0;
		}
		
		if(currRow == N1 && currCol == N2) {
			System.out.print(path + " ");
			return 1;
		}
		
		int recAns = 0;
		
		recAns = recAns + performMove(currRow + 1, currCol, path + "V");
		recAns = recAns + performMove(currRow, currCol + 1, path + "H");
		recAns = recAns + performMove(currRow + 1, currCol + 1, path + "D");
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N1 = sc.nextInt();
		N2 = sc.nextInt();
		
		int ans = performMove(1,1,"");
		System.out.println();
		System.out.println(ans);
	}
}
