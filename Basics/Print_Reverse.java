package Basics;

import java.util.Scanner;
import java.lang.Math;

public class Print_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int revNum = 0;
		
		int N = 0;
		int temp = num;
		while(temp!=0){
			temp = temp/10;
			N++;
		}

		int count = 1;
		while(num!=0) {
			int uDigit = num%10;
			revNum = revNum + (int)(uDigit * Math.pow(10, N - count));
			num = num/10;
			count++;
		}
		
		System.out.println(revNum);
	}

}
