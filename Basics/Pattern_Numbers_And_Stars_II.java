package Basics;

import java.util.Scanner;

public class Pattern_Numbers_And_Stars_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nd = 1;
		int nst = N-1;
		int row = 1;
		
		while(row<=N) {
			//digits
			int cd = 1;
			while(cd <= nd) {
				System.out.print(cd);
				cd++;
			}
			
			//stars
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			System.out.println();
			row++;
			nd++;
			nst--;
		}
	}

}
