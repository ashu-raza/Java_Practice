package Recursion;

import java.util.Scanner;

public class Chessboard_Problem_2_Count_Print {
	static int answer;
	static int N;
	static int[][] board;
	
	public static void makeMoves(int currRow, int currCol, String path) {
		//Landed outside of board or on a Mine
		if(currRow>=N || currCol>=N || board[currRow][currCol] == 1) {
			return;
		}
		
		path = path + "{" + currRow + "-" + currCol + "}";
		
		if(currRow == N-1 && currCol == N-1) {
			System.out.print(path + " ");
			answer++;
			return;
		}
		
		//Port Move
		if(board[currRow][currCol] == 2) {
			makeMoves(N-1, N-1, path + "P");
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
		
		board = new int[N][N];
		
		int digit = 1;
		int count = 1;
		for(int i = 0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(isPrime(digit)) {
					if(count == 1) {
						board[i][j] = count;
						count = 2;
					}else {
						board[i][j] = count;
						count = 1;
					}
				}else {
					board[i][j] = 0;
				}
				digit ++;
			}
		}
		
		makeMoves(0,0, new String(""));
		System.out.println();
		System.out.println(answer);
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
