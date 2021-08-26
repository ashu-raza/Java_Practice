package Basics;
import java.util.Scanner;

public class Sort_0_and_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		//input loop
		int nZ = 0;
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
			if(array[i]==0) {
				nZ++;
			}
		}
		
		//sorting loop
		for(int i = 0; i<N; i++) {
			if(i<nZ) {
				array[i] = 0;
				continue;
			}else{
				array[i] = 1;
			}
		}
		
		//output loop
		for(int i = 0; i<N; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
