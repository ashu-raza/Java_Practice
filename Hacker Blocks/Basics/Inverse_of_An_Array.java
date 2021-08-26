package Basics;
import java.util.Scanner;

public class Inverse_of_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int invArray[] = new int [N];
		
		for(int position = 0; position<N; position++ ) {
			int digit = array[position];
			invArray[digit] = position;
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(invArray[i] + " ");
		}
	}

}
