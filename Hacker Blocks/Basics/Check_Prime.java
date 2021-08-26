package Basics;
import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean isPrime = true;
		
		for (int j = 2; j<=(N/2); j++) {
			int rem = N%j;
			
			if(rem == 0) {
				System.out.println("Not Prime");
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true) {
			System.out.println("Prime");
		}
	}

}
