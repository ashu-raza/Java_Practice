package Basics;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N1 = 0;
		int N2 = 0;
		
		if(A >= B) {
			N1 = A;
			N2 = B;
		}else {
			N1 = B;
			N2 = A;
		}
		
		int LCM = 0;
		
		for(int j =1; true; j++) {
			int M1 = N1 * j;
			
			for(int k =1; true; k++) {
				int M2 = N2 * k;
				
				if(M2 == M1) {
					LCM = M2;
					break;
				}
				
				if (M2 > M1) {
					break;
				}
			}
			
			if (LCM != 0) {
				break;
			}
		}
		
		System.out.println(LCM);
	}

}
