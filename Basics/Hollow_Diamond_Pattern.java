package Basics;
import java.util.Scanner;

public class Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nstf = N/2 + 1;
		int nsp = -1;
		int nsta = N/2;
		int row = 1;
		
		while(row <= N) {
			//Forward stars
			int cst = 1;
			while(cst<=nstf) {
				System.out.print("*\t");
				cst++;
			}
			
			//Spaces
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" \t");
				csp++;
			}
			
			//Afterward stars
			cst = 1;
			while(cst<=nsta) {
				System.out.print("*\t");
				cst++;
			}
			
			System.out.println();
			if (row <= N/2) {
				nstf--;
				nsp+=2;
				
				if(row != 1) {
					nsta--;
				}
			} else {
				nstf++;
				nsp-=2;
				
				if(row != N-1) {
					nsta++;
				}
			}
			row++;
		}
	}

}
