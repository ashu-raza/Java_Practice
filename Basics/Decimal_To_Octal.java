package Basics;
import java.util.Scanner;

public class Decimal_To_Octal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int newN = 0;
		int count =  0;
		while(n>0) {
			int rem = n%8; 
			n = n/8; //Divide by destination base
			rem = (int)(rem*Math.pow(10, count)); //Multiply by source base
			newN += rem; 
			count++;
		}
		System.out.println(newN);
	}

}
