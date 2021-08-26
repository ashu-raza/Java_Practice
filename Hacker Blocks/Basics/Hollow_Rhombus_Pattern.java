package Basics;
import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int row = 1;
		int nsp = N-1;
		int nst = N;
		
		while(row<=N) {
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print(' ');
				csp++;
			}
			
			//stars
			int cst = 1;
			while(cst<=nst) {
				if(row==1||row==N) {
					System.out.print('*');
				}else{
					if(cst==1||cst==nst) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				
				cst++;
			}
			
			//next row preparartion
			System.out.println();
			row++;
			nsp--;
		}
		
	}

}
