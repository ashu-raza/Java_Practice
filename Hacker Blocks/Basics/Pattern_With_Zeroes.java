package Basics;
import java.util.Scanner;

public class Pattern_With_Zeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int row = 0;
		int nst = 1;
		
		while(row<N) {
			//stars
			int cOfst = 1;
			while(cOfst <= nst) {
				if(cOfst == 1 || cOfst == nst) {
					System.out.print(nst + "\t");
				}else {
					System.out.print(0 + "\t");
				}
				
				cOfst++;
			}
			
			System.out.println();
			row++;
			nst++;
		}
	}

}
