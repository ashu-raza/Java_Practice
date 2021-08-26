package Basics;

import java.util.Scanner;

public class Odd_And_Even_Back_In_Delhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		while (count<=N) {
			int num = sc.nextInt();
			
			int sEven = 0;
			int sOdd = 0;
			while (num !=0) {
				int uD = num%10;
				if (uD%2 == 0) {
					sEven += uD;
				}else {
					sOdd += uD;
				}
				num = num/10;
			}
			
			if(sOdd%3 == 0 || sEven%4 == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			count++;
		}
		
	}

}
