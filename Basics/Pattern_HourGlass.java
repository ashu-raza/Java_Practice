package Basics;
import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nsp = 0;
		int nd = 2*N + 1;
		int row = 1;
		
		while(row <= (2*N+1)) {
			//Spaces
			int csp = 1;
			while(csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//Backward Digits
			int digit = nd/2;
			int cd = 1;
			while(cd <= (nd/2 + 1)) {
				System.out.print(digit + " ");
				digit--;
				cd++;
			}
			
			//Forward Digits
			digit = 1;
			cd = 1;
			while(cd <= nd/2) {
				System.out.print(digit + " ");
				digit++;
				cd++;
			}
			
			//Preparation for next row
			System.out.println();
			if (row <= N) {
				nsp++;
				nd -= 2;
			}else {
				nsp--;
				nd += 2;
			}
			row++;
		}
		
	}

}
