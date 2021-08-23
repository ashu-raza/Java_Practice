package Basics;
import java.util.Scanner;

public class Manmohan_Loves_Patterns_I {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int row = 1;
		while(row<=N) {
			if((row%2)!=0) {
				int cst = 1;
				while(cst<=row) {
					System.out.print('1');
					cst++;
				}
			}else {
				int cst = 1;
				while(cst<=row) {
					if(cst==1 || cst==row) {
						System.out.print('1');
					}else {
						System.out.print('0');
					}
					cst++;
				}
			}
			System.out.println();
			row++;
		}
	}

}
