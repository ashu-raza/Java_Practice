package Basics;
import java.util.Scanner;

public class Sorting_In_Linear_Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		
		//input loop
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
			
			if(array[i]==0) {
				zeroes++;
			}
			if(array[i] == 1) {
				ones++;
			}
		}
		
		//output loop
		for(int i = 0; i<N; i++) {
			if(i<zeroes) {
				System.out.println(0);
			}
			
			if(i>=zeroes&&i<(zeroes+ones)) {
				System.out.println(1);
			}
			
			if(i>=(zeroes+ones)){
				System.out.println(2);
			}
		}
	}

}
