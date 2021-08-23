package Basics;
import java.util.Scanner;

public class Zeroes_At_End {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		int[] newArray = new int[N];
		
		int j = N-1;
		int k = 0;
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] == 0) {
				newArray[j] = 0;
				j--;
			}else {
				newArray[k] = array[i];
				k++;
			}
		}
				
		for(int i = 0; i<N; i++) {
			System.out.print(newArray[i] + " ");
		}
		
	}
}
