package Basics;
import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			if(array[i]==M) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(-1);
	}

}
