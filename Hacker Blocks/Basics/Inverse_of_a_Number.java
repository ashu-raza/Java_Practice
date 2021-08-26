package Basics;
import java.util.Scanner;

public class Inverse_of_a_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int invNum = 0;
		
		int place = 1;
		while(Num>0) {
			int extDigit = Num % 10;//extracted digit
			
			invNum = invNum + (int)( place * Math.pow(10, (extDigit - 1)) );
			
			Num = Num/10;
			place++;
		}
		
		System.out.println(invNum);
	}

}
