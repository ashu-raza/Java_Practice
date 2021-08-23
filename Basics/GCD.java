package Basics;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int dividend;
		int divisor;
		
		if (N1>N2) {
			dividend = N1;
			divisor = N2;
		}else {
			dividend = N2;
			divisor = N1;
		}
		
		int remainder;
		
		do{
			remainder = dividend % divisor;
			
			if(remainder!=0) {
				dividend = divisor;
				divisor = remainder;
			}
		}while(remainder!=0);
		
		
		System.out.println(divisor);
	}

}
