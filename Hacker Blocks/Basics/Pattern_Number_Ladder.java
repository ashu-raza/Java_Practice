package Basics;
import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int digit = 1;
		
		int row = 1;
		while(row <= N) {
			int cd = 1;
			while(cd<=row) {
				System.out.print(digit + "\t");
				digit++;
				cd++;
			}
			
			System.out.println();
			row++;
		}

	}

}
