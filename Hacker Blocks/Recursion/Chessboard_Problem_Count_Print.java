package Recursion;

import java.util.Scanner;

public class Chessboard_Problem_Count_Print {
	static int answer;
	static int N;
	
	public static void makeMoves(int currRow, int currCol, String path) {
		if(currRow>=N || currCol>=N) {
			return;
		}
		
		path = path + "{" + currRow + "-" + currCol + "}";
		
		if(currRow == N-1 && currCol == N-1) {
			System.out.print(path + " ");
			answer++;
			return;
		}
		
		//Forward Knight Move 1
		makeMoves(currRow+2, currCol+1, path + "K");
		//Forward Knight Move 2
		makeMoves(currRow+1, currCol+2, path + "K");
		
		if(currRow == 0 || currRow == N-1 || currCol == 0 || currCol == N-1) {
			//Horizontal Rook Moves
			for(int steps = 1; steps <= ((N-1)-currCol); steps++) {
				makeMoves(currRow, currCol+steps, path + "R");
			}
			
			//Vertical Rook Moves
			for(int steps = 1; steps <= ((N-1)-currRow); steps++) {
				makeMoves(currRow + steps, currCol, path + "R");
			}
		}
		
		if(currRow == currCol || currRow + currCol == N-1) {
			//Forward Bishop Moves
			for(int steps = 1; steps<N; steps++) {
				makeMoves(currRow + steps, currCol + steps, path + "B");
			}
		}
		
		return;
	}
	
	public static void main(String[] args) {
		answer = 0;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		makeMoves(0,0, new String(""));
		System.out.println();
		System.out.println(answer);
	}
}
