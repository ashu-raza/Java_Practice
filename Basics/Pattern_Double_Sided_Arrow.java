package Basics;
import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nspf = N - 1;
		int ndf = 1;
		int nspm = -1;
		int nda = 1;
		int firstDigit = 1;

		int row = 1;
		while(row<=N) {
			//forward spaces
			int cspf = 1;
			while(cspf <= nspf) {
				System.out.print("  ");
				cspf++;
			}
			
			//forward digits			
			int digit = firstDigit;
			int cdf = 1;
			while(cdf <= ndf) {
				System.out.print(digit + " ");
				digit--;
				cdf++;
			}
			
			//middle spaces
			int cspm = 1;
			while(cspm <= nspm) {
				System.out.print("  ");
				cspm++;
			}
			
			//afterward digits
			int cda = 1;
			while(cda <= nda) {
				if(row != 1 && row!= N) {
					System.out.print(cda + " ");
				}
				cda++;
			}
			
			//preparation for next row
			System.out.println();
			if(row <= N/2) {
				nspf-=2;
				ndf++;
				firstDigit++;
				nspm+=2;
				nda++;
			} else {
				nspf+=2;
				ndf--;
				firstDigit--;
				nspm-=2;
				nda--;
			}
			row++;
		}
		
	}

}
