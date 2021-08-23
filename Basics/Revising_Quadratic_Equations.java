package Basics;
import java.util.Scanner;

public class Revising_Quadratic_Equations {
	public static void rootCalculator(int a, int b, int c) {		
		int r1 = (int)((-1*b) + Math.sqrt((b*b) - (4*a*c)))/(2*a);
		int r2 = (int)((-1*b) - Math.sqrt((b*b) - (4*a*c)))/(2*a);
		
		if(r1>r2) {
			System.out.println(r2 + " " + r1);
		} else {
			System.out.println(r2 + " " + r1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int D = (b*b) - (4*a*c);

		if(D>0) {
			System.out.println("Real and Distinct");
			rootCalculator(a,b,c);
		} else if(D == 0) {
			System.out.println("Real and Equal");
			rootCalculator(a,b,c);
		} else {
			System.out.println("Imaginary");			
		}	
	}

}
