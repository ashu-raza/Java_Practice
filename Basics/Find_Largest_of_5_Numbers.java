package Basics;
import java.util.Scanner;

public class Find_Largest_of_5_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		
		for(int j= 0; j<input.length; j++) {
			input[j] = sc.nextInt();
		}
		
		int maxElement = input[0];
		for(int j= 1; j<input.length; j++) {
			if(input[j]>maxElement) {
				maxElement = input[j];
			}
		}
		
		System.out.println(maxElement);
	}

}
