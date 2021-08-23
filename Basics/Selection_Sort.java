package Basics;
import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			int minValue = Integer.MAX_VALUE;
			int minPointer = -1;
			
			for(int j = i; j<N; j++) {
				if(array[j] < minValue) {
					minValue = array[j];
					minPointer = j;
				}
			}

			int temp = array[i];
			array[i] = array[minPointer];
			array[minPointer] = temp;
		}
		
		for(int i = 0; i<N; i++) {
			System.out.println(array[i]);
		}
	}

}
