package Basics;
import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//count digits
		int temp = num;
		int n = 1;
		while(temp>0){
			temp /= 10;
			n++;
		}
		n--;
		
		//find sum
		temp = num;
		int sum = 0;
		while(temp>0) {
			int digit = temp%10;
			temp /= 10;
			sum = sum + (int)(Math.pow(digit, n));
		}
		
		if(sum==num) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
