package Basics;
import java.util.Scanner;

public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nsp = N/2;
		int nst = 1;
		int row = 1;
		
		while(row<=N) {
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print(" \t");
				csp++;
			}
			
			//stars
			int cst = 0;
			while(cst<nst) {
				System.out.print("*\t");
				cst++;
			}
			
			//preparation for next row
			System.out.println();
			if (row<((N/2) + 1)) {
				nsp--;
				nst+=2;
			} else {
				nsp++;
				nst-=2;
			}
			row++;
		}
		
	}

}
