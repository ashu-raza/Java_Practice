package Basics;
import java.util.Scanner;

public class Running_Sum_of_Given_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int nums[] = new int[N];
		int sums[] = new int[N];
		
		int i = 0;
		while(i<N) {
			nums[i] = sc.nextInt();
			
			if(i==0) {
				sums[i] = nums[i];
			}else {
				sums[i] = nums[i] + sums[i-1];				
			}
			
			i++;
		}
		
		for(int j = 0; j<N; j++) {
			System.out.print(sums[j]+" ");
		}
		
	}
	
}
