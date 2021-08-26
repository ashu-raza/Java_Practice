package Basics;
import java.util.Scanner;

public class Pascal_Triangle_Using_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nst = 1;
		int row = 1;
		
		int[] prevRowDigitAt = {1};
		int[] currRowDigitAt;
		
		while(row<=N){
			currRowDigitAt = new int[nst];
			
			for(int cst = 0; cst<nst; cst++) {
				int digit = 1;
				
				if(cst==0||cst==(nst-1)) {
					System.out.print(digit + "\t");
				}else {
					digit = prevRowDigitAt[cst] + prevRowDigitAt[cst-1];
					System.out.print(digit + "\t");
				}
				
				currRowDigitAt[cst] = digit;
			}
			
			//Preparation for next row:
			System.out.println();
			nst++;
			row++;
			prevRowDigitAt = currRowDigitAt;
		}
		
	}	
}
