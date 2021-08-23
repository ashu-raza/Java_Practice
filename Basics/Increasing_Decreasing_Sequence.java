package Basics;
import java.util.Scanner;

public class Increasing_Decreasing_Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] S = new int[N];
		for(int i = 0; i<N; i++) {
			S[i] = sc.nextInt();
		}
		
		if(N==1) {
			System.out.println(false);
			return;
		}
		
		int i=0;
		while(i<=N-2){
			if(S[i]>S[i+1]) {
				i++;
				continue;
			}else {
				break;
			}
		}
		
		int j = i+1; 
		while(j<=N-2) {
			if(S[j]<S[j+1]) {
				j++;
				continue;
			}else {
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
		
	}

}
