package Basics;
import java.util.Scanner;

public class Number_System_Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		int newN = 0;
		
		int count = 0;
		while(N>0) {			
			int rem = N%k;
			rem = (int)(rem * Math.pow(10,count));
			newN += rem; 
			N = N/k;			
			count++;
		}
		
		int sum = 0;
		while(newN>0) {
			int uD = newN%10;
			newN /= 10; 
			sum += uD;
		}
		System.out.println(sum);
	}

}
