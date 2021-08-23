package Basics;
import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			int[] C = new int [4]; 
			
			for(int i=0; i<4; i++) {
				C[i] = sc.nextInt();
			}
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] rickshawNo = new int[n];
			int[] cabNo = new int[m];
			
			for(int i=0; i<n; i++) {
				rickshawNo[i] = sc.nextInt();
			}
			
			for(int i=0; i<m; i++) {
				cabNo[i] = sc.nextInt();
			}
			
			int sumRickshaw = 0;
			for(int i=0; i<n; i++) {
				rickshawNo[i] = C[0]*rickshawNo[i];
				rickshawNo[i] = Math.min(rickshawNo[i],C[1]);
				sumRickshaw += rickshawNo[i]; 
			}
			sumRickshaw = Math.min(sumRickshaw, C[2]);
			
			int sumCab = 0;
			for(int i=0; i<m; i++) {
				cabNo[i] = C[0]*cabNo[i];
				cabNo[i] = Math.min(cabNo[i],C[1]);
				sumCab += cabNo[i]; 
			}
			sumCab = Math.min(sumCab, C[2]);
			
			int netSum = sumRickshaw + sumCab;
			netSum = Math.min(netSum,C[3]);
			
			System.out.println(netSum);
			T--;
		}

	}

}
