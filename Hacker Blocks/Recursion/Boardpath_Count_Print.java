package Recursion;

import java.util.Scanner;

public class Boardpath_Count_Print {
	static int N;
	static int M;
	
	public static int play(String path, int sum) {
		if(sum>N) {
			return 0;
		}
		
		if(sum == N) {
			System.out.print(path + " ");
			return 1;
		}
		
		int recAns = 0;
		for(int i = 1; i<=M; i++) {
			recAns = recAns + play(path + i, sum + i);
		}
		
		return recAns;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int ans = play("", 0);
		System.out.println();
		System.out.println(ans);
	}
	
}
