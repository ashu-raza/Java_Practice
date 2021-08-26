package Basics;
import java.util.Scanner;

public class Chewbacca_And_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long newN = 0;
		int count = 0;
		while(N>0) {
			long digit = N%10;
			
			if(digit>=5) {
				if(!(N/10==0 && digit==9)) {
					digit = 9 - digit; //invert
				}
			}
			
			newN = newN + (long)(digit*Math.pow(10,count));
			N = N/10;
			count++;
		}
		System.out.println(newN);
	}

}
