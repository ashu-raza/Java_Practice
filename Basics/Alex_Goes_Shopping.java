package Basics;
import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] priceOfItemType = new int[N];
		
		for(int i = 0; i<N; i++) {
			priceOfItemType[i] = sc.nextInt();
		}
		
		int Q = sc.nextInt();
		
		int count = 0;
		while(count<Q) {
			int A = sc.nextInt();
			int K = sc.nextInt();
			
			int possibility = 0;
			
			for(int i = 0; i<N; i++) {
				if(A%priceOfItemType[i] == 0) {
					possibility++;
				}
			}
			
			if(possibility >= K) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			count++;
		}

	}

}
