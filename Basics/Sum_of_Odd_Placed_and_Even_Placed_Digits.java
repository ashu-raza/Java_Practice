package Basics;
import java.util.Scanner;

public class Sum_of_Odd_Placed_and_Even_Placed_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sumE = 0;
		int sumO = 0;
		
		int count = 1;
		while( N > 0) {
			int uD = N%10;
			
			if (count % 2 == 0) {
				sumE += uD;
			}else {
				sumO += uD;
			}
			
			N = N/10;
			count++;
		}
		
		System.out.println(sumO);
		System.out.println(sumE);

	}

}
