package Basics;
import java.util.Scanner;

public class Print_Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int j = 2; j<=N; j++) {
			boolean isPrime = true; //Assuming that j is a prime number
			
			for(int k = 2; k<=(j/2); k++) {
				if(j % k == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime == true) {
				System.out.println(j);
			}
		}
	}

}
