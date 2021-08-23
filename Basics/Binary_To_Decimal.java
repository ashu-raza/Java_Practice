package Basics;
import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int dec = 0;
		
		int count = 0;
		while(N>0) {
			int rem  = N%10; //Divide by destination base
			N = N/10;
			
			rem = (int)(rem*Math.pow(2, count)); //Multiply by source base
			dec = dec + rem;
			count++;
		}
		System.out.println(dec);
	}

}
