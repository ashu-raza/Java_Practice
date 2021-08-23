package Basics;
import java.util.Scanner;

public class Arrays_Reverse_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] revArray = new int[n];
		
		int i = 0;
		while(i<n) {
			revArray[n-1 - i] = sc.nextInt();
			i++;
		}
		
		for(i = 0; i<n; i++) {
			System.out.println(revArray[i]);
		}

	}

}
