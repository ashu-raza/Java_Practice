package Basics;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		int[] complimentOf = new int [N];

		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
			complimentOf[i] = -1;
		}
		
		int target = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			if(complimentOf[i] != Integer.MIN_VALUE) {
				int x = target - array[i];
				for(int j = 0; j<N; j++) {
					if(array[j] == x) {
						complimentOf[i] = j;                 //if j == i and this line is executed then complimentOf[i] becomes 'j' in this line
						complimentOf[j] = Integer.MIN_VALUE; //but if j == i then complimentOf[i] shall again be updated to Integer.MIN_VALUE in this line
					}
				}
			}
		}
		
		for(int i = 0; i<N; i++) {
			if(complimentOf[i]>=0) {
				int a = Math.min(array[i], array[complimentOf[i]]);
				int b = Math.max(array[i], array[complimentOf[i]]);
				System.out.println(a + " and " + b);
			}
		}
		
		
	}

}
