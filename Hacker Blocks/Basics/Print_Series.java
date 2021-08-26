package Basics;
import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		for(int j = 1; N1!=0 ; j++) {
			int x = 3*j + 2;
			
			if(x % N2 != 0) {
				System.out.println(x);
				N1--;
			}
		}
	
	}

}
