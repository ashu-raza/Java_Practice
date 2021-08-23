package Basics;
import java.util.Scanner;

public class Conversion_F_To_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minF = sc.nextInt();
		int maxF = sc.nextInt();
		int step = sc.nextInt();
		
		int fValue = minF;
		while(fValue<=maxF) {
			int cValue = (int)((5.0/9)*(fValue - 32));
			System.out.println(fValue + "\t" + cValue);
			fValue += step; 
		}
		
	}

}
