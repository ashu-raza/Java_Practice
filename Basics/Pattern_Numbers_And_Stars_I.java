package Basics;
import java.util.Scanner;

public class Pattern_Numbers_And_Stars_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nd = N;
		int nst = -1;
		int row = 1;
		
		while(row<=N) {
			//digits
			int cd = 1;
			while(cd <= nd) {
				System.out.print(cd);
				System.out.print(' ');
				cd++;
			}
			
			//stars
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nd--;
			nst += 2;
		}
	}

}
