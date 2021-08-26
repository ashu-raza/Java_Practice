package Basics;
import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			int N = sc.nextInt();
			
			int[] priceOfRose = new int[N];
			for(int i = 0; i<N; i++) {
				priceOfRose[i] = sc.nextInt();
			}
			
			int M = sc.nextInt();
			
			int[] complimentOf = new int [N];
			
			for(int i = 0; i<N; i++) {
				int x = M - priceOfRose[i]; 
				
				int iPrime = -1;
				for(int j = 0; j<N ;j++) {
					if(j!=i && priceOfRose[j] == x) {
						iPrime = j;
					}
				}
				complimentOf[i] = iPrime;
			}
			
			int[] finalPrices = new int[2];
			
			int minDiff = Integer.MAX_VALUE;			
			for(int i = 0; i<N; i++) {
				int diff = 0; 
				if(complimentOf[i] > -1) {
					diff = Math.abs(priceOfRose[i] - priceOfRose[complimentOf[i]]);
					
					if(diff<minDiff) {
						minDiff = diff;
						finalPrices[0] = Math.min(priceOfRose[i], priceOfRose[complimentOf[i]]);
						finalPrices[1] = Math.max(priceOfRose[i], priceOfRose[complimentOf[i]]);
					}	
				}
			}
			
			System.out.println("Deepak should buy roses whose prices are " + finalPrices[0] +" and " + finalPrices[1] +".");
			T--;
			System.out.println();
		}

	}

}
