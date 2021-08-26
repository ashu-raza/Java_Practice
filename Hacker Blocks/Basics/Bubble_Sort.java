package Basics;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int endPointer = N-1;
		
		while(endPointer>0) {
			for(int i = 0; i<endPointer; i++) {
				if(array[i]>array[i+1]) {
					//swap
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			endPointer--;
		}
		
		for(int element: array) {
			System.out.print(element + " ");
		}
	}

}
