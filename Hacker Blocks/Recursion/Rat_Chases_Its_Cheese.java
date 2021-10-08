package Recursion;

import java.util.Scanner;

public class Rat_Chases_Its_Cheese {
	static char[][] grid;

	static boolean pathFoundFlag;
	static int[][] pathMatrix;
	
	public static void findPath(int currRow, int currCol) {
		//Landed outside of grid
		if(currRow<0 || currRow>grid.length-1 || currCol<0 || currCol>grid[0].length-1) {
			return;
		}
		//Landed on a blocked cell or on an already visited cell
		if(grid[currRow][currCol] == 'X' || pathMatrix[currRow][currCol] == 1) {
			return;
		}
		
		pathMatrix[currRow][currCol] = 1;
		
		//Landed on desired destination
		if(currRow == grid.length-1 && currCol == grid[0].length-1) {
			pathFoundFlag = true;
			return;
		}
		
		//Move Down
		if(pathFoundFlag == false) {
			findPath(currRow+1, currCol);
		}
		//Move Up
		if(pathFoundFlag == false) {
			findPath(currRow-1, currCol);
		}

		//Move Right
		if(pathFoundFlag == false) {
			findPath(currRow, currCol+1);
		}
		
		//Move Left
		if(pathFoundFlag == false) {
			findPath(currRow, currCol-1);
		}

		//BackTrack if you have returned without finding a valid path despite making all moves
		if(pathFoundFlag == false) {
			pathMatrix[currRow][currCol] = 0;
		}
		
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		grid = new char[N][M];		
		for(int i = 0; i<N; i++) {
			String str = sc.next();
			for(int j = 0; j<M; j++) {
				grid[i][j] = str.charAt(j);
			}
		}
		
		pathFoundFlag = false;
		pathMatrix = new int[N][M];
		
		findPath(0, 0);
		
		if(pathFoundFlag==false) {
			System.out.println("NO PATH FOUND");
		}else {
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					System.out.print(pathMatrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
