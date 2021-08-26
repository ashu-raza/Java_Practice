package Basics;
import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		//input loop
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int Q = sc.nextInt();
		
		while(Q>0){
			int X = sc.nextInt();
			
			int[] temp = new int[N];
			
			for(int i = 0; i<N; i++) {
				if(i>=X) {
					temp[i] = array[i] + array[i-X];
				}else {
					temp[i] = array[i] + array[N+(i-X)];
				}
			}
			
			array = temp;
			Q--;
		}
		
		int sum = 0;
		for(int i = 0; i<N; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
	}

}
