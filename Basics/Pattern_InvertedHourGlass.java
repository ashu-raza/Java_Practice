package Basics;
import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nf = 1;
		int na = 1;
		int nsp = 2*N - 1;
		int row = 1;
		while(row<=(2*N + 1)) {
			//Forward Digits
			
			int digit = N;
			int cd = 1;
			while(cd<=nf) {
				System.out.print(digit + " ");
				digit--;
				cd++;
			}
			
			//Spaces
			
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//Afterward Digits
			if(row < N+1) {
				digit = N - (row - 1);
			} else if(row == N+1) {
				digit = 1;
			} else {
				digit = (row - 1) - N;
			}
			
			cd = 1;
			while(cd<=na) {
				System.out.print(digit + " ");
				digit++;
				cd++;
			}
			
			//Preparation for next row
			if(row <= N) {
				nsp-=2;
				nf++;
				if(row != N) {
					na++;
				}
			}else {
				nsp+=2;
				nf--;
				if(row != (N + 1)) {
					na--;
				}
			}
			System.out.println();
			row++;
		}
	}

}
