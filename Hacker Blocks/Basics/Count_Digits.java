package Basics;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int digit = sc.nextInt();
		int count = 0;
		
		while(num>0) {
			int unitDigit = num%10;
			
			if (unitDigit == digit) {
				count++;
			}
			
			num/=10;
		}
		
		System.out.println(count);
	}

}
