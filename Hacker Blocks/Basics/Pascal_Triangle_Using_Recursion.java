package Basics;
import java.util.Scanner;

public class Pascal_Triangle_Using_Recursion {
	public static int digitAt(int rowNo, int colNo) {
		int digit = 0;
		
		if(colNo == 1 || colNo == rowNo) {
			digit = 1;
		}else {
			digit = digitAt(rowNo - 1, colNo) + digitAt(rowNo - 1, colNo - 1);
		}
		
		return digit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		int nst = 1;
		int row = 1;
		while(row<=N){
			
			for(int cst = 1; cst<=nst; cst++) {
				int digit = digitAt(row,cst);
				System.out.print(digit + "\t");
			}
			
			//Preparation for next row:
			System.out.println();
			nst++;
			row++;
		}
		
	}
	
}
