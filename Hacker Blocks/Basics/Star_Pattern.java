package Basics;
import java.util.Scanner;

public class Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int row = 0;
		int nsp = N-1;
		int nst = 1;
		
		while(row < N) {
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("\t");
				csp++;
			}
			
			//stars
			int cst = 0;
			while(cst<nst) {
				System.out.print("*\t");
				cst++;
			}
			
			System.out.println();
			row++;
			nsp--;
			nst++;
		}
	}

}
