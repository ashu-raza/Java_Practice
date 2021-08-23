package Basics;
import java.util.Scanner;

public class Arrays_Is_Second_Array_Mirror_Inverse_of_First_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] firstArray = new int[N];
		int[] secondArray = new int[N];
		
		for(int i = 0; i<N; i++) {
			firstArray[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			secondArray[i] = sc.nextInt();
		}
		
		for(int position = 0; position<N; position++) {
			int digit = firstArray[position];
			//digit->position
			//position->digit
			if(secondArray[digit] != position) {
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
	}

}
