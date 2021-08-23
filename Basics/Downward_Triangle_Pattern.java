package Basics;
import java.util.Scanner;

public class Downward_Triangle_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int row = 0; 
		int nst = 2*N - 1;
		int nsp = 0;
		
		while(row < N ){
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print(' ');
				csp++;
			}
			
			//alternate stars
			int cst = 0;
			while(cst < nst) {
				if(cst%2 == 0) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
				
				cst++;
			}
			
			System.out.println();
			row++;
			nsp++;
			nst-=2;
		}

	}

}
