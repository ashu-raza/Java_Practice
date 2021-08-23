package Basics;
import java.util.Scanner;

public class Manmohan_Loves_Patterns_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println('1');
		int row = 2;
		while(row<=N) {
			int cst = 1;
			while(cst<=row) {
				if(cst==1 || cst==row) {
					System.out.print(row-1);
				}else {
					System.out.print('0');
				}
				cst++;
			}
			
			System.out.println();
			row++;
		}
	}

}
